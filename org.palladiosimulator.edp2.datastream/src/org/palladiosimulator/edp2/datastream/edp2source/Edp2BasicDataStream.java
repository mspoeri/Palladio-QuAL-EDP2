package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.Iterator;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.MeasurementsDao;
import org.palladiosimulator.edp2.datastream.BasicDataStream;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.measurementspec.BasicMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;

public class Edp2BasicDataStream<V,Q extends Quantity> extends BasicDataStream<V,Q> {

    private final DataSeries dataSeries;
    private final MeasurementsDao<V, Q> measurementsDao;

    @SuppressWarnings("unchecked")
    public Edp2BasicDataStream(final DataSeries dataSeries, final BaseMetricDescription metricDescription) {
        super(metricDescription);
        this.dataSeries = dataSeries;
        measurementsDao = (MeasurementsDao<V, Q>) MeasurementsUtility.getMeasurementsDao(this.dataSeries);
    }

    @Override
    public Iterator<BasicMeasurement<V, Q>> iterator() {
        final Iterator<Measure<V,Q>> innerIterator = measurementsDao.getMeasurements().iterator();
        return new Iterator<BasicMeasurement<V,Q>>() {

            @Override
            public boolean hasNext() {
                return innerIterator.hasNext();
            }

            @Override
            public BasicMeasurement<V, Q> next() {
                return new BasicMeasurement<V,Q>(innerIterator.next(), getMetricDesciption());
            }

            @Override
            public void remove() {
                innerIterator.remove();
            }
        };
    }

    @Override
    public void close() {
        try {
            measurementsDao.close();
        } catch (final DataNotAccessibleException e) {
            throw new RuntimeException("Failed to close EDP2 data stream",e);
        }
    }

}
