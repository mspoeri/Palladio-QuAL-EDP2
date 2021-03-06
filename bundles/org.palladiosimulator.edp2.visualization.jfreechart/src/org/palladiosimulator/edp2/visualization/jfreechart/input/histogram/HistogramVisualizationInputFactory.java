package org.palladiosimulator.edp2.visualization.jfreechart.input.histogram;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInputFactory;

public class HistogramVisualizationInputFactory extends JFreeChartVisualizationInputFactory {

    public static final String FACTORY_ID = HistogramVisualizationInputFactory.class.getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new HistogramVisualizationInput();
    }

}
