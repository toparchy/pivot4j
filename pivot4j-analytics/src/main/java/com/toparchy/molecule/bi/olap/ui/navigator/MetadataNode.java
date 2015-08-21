package com.toparchy.molecule.bi.olap.ui.navigator;

import org.olap4j.metadata.MetadataElement;

import com.toparchy.molecule.bi.olap.component.tree.LazyTreeNode;
import com.toparchy.molecule.bi.olap.component.tree.NodeData;

public abstract class MetadataNode<T extends MetadataElement> extends
		LazyTreeNode<T> {

	/**
	 * @param object
	 */
	public MetadataNode(T object) {
		super(object);
	}

	/**
	 * @see com.toparchy.molecule.bi.olap.component.tree.LazyTreeNode#createData(java.lang.Object)
	 */
	@Override
	protected NodeData createData(T object) {
		return new NodeData(object.getUniqueName(), object.getCaption());
	}
}
