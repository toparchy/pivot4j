package com.toparchy.molecule.bi.olap.ui.chart;

import javax.faces.context.FacesContext;

import org.pivot4j.ui.chart.ChartRenderContext;
import org.primefaces.component.chart.bar.BarChart;

public class HorizontalBarChartBuilder extends BarChartBuilder {

	public static String NAME = "HorizontalBar";

	/**
	 * @param context
	 */
	public HorizontalBarChartBuilder(FacesContext context) {
		super(context);
	}

	/**
	 * @see com.toparchy.molecule.bi.olap.ui.chart.ChartBuilder#getName()
	 */
	@Override
	public String getName() {
		return NAME;
	}

	/**
	 * @see com.toparchy.molecule.bi.olap.ui.chart.AbstractChartBuilder#configureChart(org.pivot4j.ui.chart.ChartRenderContext,
	 *      org.primefaces.component.chart.UIChart)
	 */
	@Override
	protected void configureChart(ChartRenderContext context, BarChart chart) {
		super.configureChart(context, chart);

		chart.setLegendPosition("e");
		chart.setOrientation("horizontal");
	}
}
