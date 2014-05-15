/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import java.awt.Color;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.jfree.chart.ChartColor;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.data.general.AbstractDataset;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.impl.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;
import org.palladiosimulator.edp2.visualization.elementfactories.JFreeChartVisualizationInputFactory;
import org.palladiosimulator.edp2.visualization.util.DefaultUnitSwitch;
import org.palladiosimulator.metricspec.BaseMetricDescription;

/**
 * Implementation of an {@link AbstractVisualizationInput} for
 * {@link JFreeChartVisualizationSingleDatastreamInput}s.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class JFreeChartVisualizationInput
extends AbstractVisualizationInput<JFreeChartVisualizationSingleDatastreamInput> {

    private AbstractDataset currentCachedDataset;

    /**
     * Empty constructor.
     */
    public JFreeChartVisualizationInput() {
        super();
    }

    /**
     * Constructor with a first input.
     */
    public JFreeChartVisualizationInput(final JFreeChartVisualizationSingleDatastreamInput firstInput) {
        this();
        addInput(firstInput);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#exists()
     */
    @Override
    public boolean exists() {
        return !inputs.isEmpty();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        return ImageDescriptor.getMissingImageDescriptor();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    @Override
    public String getName() {
        return "JFreeChart EDP2 Editor";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getPersistable()
     */
    @Override
    public IPersistableElement getPersistable() {
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getToolTipText()
     */
    @Override
    public String getToolTipText() {
        return getName();
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ISelection#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return getInputs().size() == 0;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        JFreeChartVisualizationInputFactory.saveState(memento, this);
    }

    /**
     * Creates a new {@link JFreeChart}. Charts are specific for each
     * EditorInput. Typically an update of the current DataSet is recommended,
     * before the chart itself is updated.
     */
    final JFreeChart createChart() {
        if (currentCachedDataset == null) {
            reloadData();
        }
        final JFreeChartVisualizationConfiguration configuration = getConfiguration();
        final Plot plot = generatePlot(configuration, currentCachedDataset);

        return new JFreeChart(
                configuration.isShowTitle() ? configuration.getTitle() : null,
                        JFreeChart.DEFAULT_TITLE_FONT, plot, configuration.isShowLegend());
    }

    @Override
    public void reloadData() {
        currentCachedDataset = generateDataset();
    }

    protected String getAxisDefaultLabel(final int pos) {
        final BaseMetricDescription metric = MetricDescriptionUtility
                .toBaseMetricDescriptions(getInputs().get(0).getDataSource().getMetricDesciption())[pos];
        return metric.getName() + " [" + new DefaultUnitSwitch(metric).doSwitch(metric) + "]";
    }

    /**
     * @param renderer
     */
    protected void configureSeriesColors(final AbstractRenderer renderer) {
        for (int i = 0; i < getInputs().size(); i++) {
            final JFreeChartVisualizationSingleDatastreamConfiguration config = getInputs().get(i).getConfiguration();
            final float alpha = config.getAlpha();
            if (config.getColor() != null && !config.getColor().equals(JFreeChartVisualizationSingleDatastreamConfiguration.NO_COLOR)){
                final Color opaque = Color.decode(config.getColor());
                final float[] comp = opaque.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            } else {
                final Color defaultColor = (Color) ChartColor.createDefaultPaintArray()[i];
                final float[] comp = defaultColor.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            }
        }
    }

    @Override
    protected PropertyConfigurable createConfiguration() {
        return new JFreeChartVisualizationConfiguration();
    }

    protected abstract Plot generatePlot(final PropertyConfigurable config, final AbstractDataset dataset);

    protected abstract AbstractDataset generateDataset();

}