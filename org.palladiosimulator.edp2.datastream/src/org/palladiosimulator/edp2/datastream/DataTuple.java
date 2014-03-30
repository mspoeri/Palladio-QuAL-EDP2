package org.palladiosimulator.edp2.datastream;

import java.util.Collections;
import java.util.List;

import javax.measure.Measure;

import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;

public class DataTuple extends MetricEntity {

    private final List<Measure<?,?>> myDataTuple;

    DataTuple(final List<Measure<?,?>> dataTuple, final MetricSetDescription metricDescription) {
        super(metricDescription);
        this.myDataTuple = Collections.unmodifiableList(dataTuple);
    }

    public List<Measure<?,?>> asList() {
        return myDataTuple;
    }

    public Measure<?,?>[] asArray() {
        final Measure<?,?>[] result = new Measure<?,?>[myDataTuple.size()];
        for (int i = 0; i < myDataTuple.size(); i++) {
            result[i] = myDataTuple.get(i);
        }
        return result;
    }
}