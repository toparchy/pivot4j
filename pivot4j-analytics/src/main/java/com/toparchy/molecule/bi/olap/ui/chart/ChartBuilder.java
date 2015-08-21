package com.toparchy.molecule.bi.olap.ui.chart;

import javax.faces.component.UIComponent;

import org.pivot4j.ui.chart.ChartRenderCallback;

public interface ChartBuilder extends ChartRenderCallback {

	String getName();

	UIComponent getComponent();

	void setComponent(UIComponent component);
}
