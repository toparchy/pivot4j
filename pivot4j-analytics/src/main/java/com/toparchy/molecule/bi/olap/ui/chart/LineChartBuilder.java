package com.toparchy.molecule.bi.olap.ui.chart;

import javax.faces.context.FacesContext;

import org.pivot4j.ui.chart.ChartRenderContext;
import org.primefaces.component.chart.line.LineChart;

public class LineChartBuilder extends AbstractSeriesChartBuilder<LineChart> {

	public static String NAME = "Line";

	/**
	 * @param context
	 */
	public LineChartBuilder(FacesContext context) {
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
	 * @see com.toparchy.molecule.bi.olap.ui.chart.AbstractChartBuilder#createChart(org.pivot4j.ui.chart.ChartRenderContext)
	 */
	@Override
	protected LineChart createChart(ChartRenderContext context) {
		return new LineChart();
	}

	/**
	 * @see com.toparchy.molecule.bi.olap.ui.chart.AbstractChartBuilder#configureChart(org.pivot4j.ui.chart.ChartRenderContext,
	 *      org.primefaces.component.chart.UIChart)
	 */
	@Override
	protected void configureChart(ChartRenderContext context, LineChart chart) {
		super.configureChart(context, chart);

		chart.setZoom(true);
	}
}
