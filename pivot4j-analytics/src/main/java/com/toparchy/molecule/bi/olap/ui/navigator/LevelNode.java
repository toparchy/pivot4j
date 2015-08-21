package com.toparchy.molecule.bi.olap.ui.navigator;

import java.util.Collections;
import java.util.List;

import org.olap4j.metadata.Level;
import org.primefaces.model.TreeNode;

import com.toparchy.molecule.bi.olap.component.tree.NodeData;

public class LevelNode extends MetadataNode<Level> {

	/**
	 * @param level
	 */
	public LevelNode(Level level) {
		super(level);
	}

	/**
	 * @param level
	 * @return
	 * @see com.toparchy.molecule.bi.olap.ui.navigator.MetadataNode#createData(org.olap4j.metadata.MetadataElement)
	 */
	@Override
	protected NodeData createData(Level level) {
		return new LevelNodeData(level);
	}

	/**
	 * @see org.primefaces.model.TreeNode#getType()
	 */
	@Override
	public String getType() {
		return "level";
	}

	/**
	 * @see org.primefaces.model.TreeNode#isLeaf()
	 */
	@Override
	public boolean isLeaf() {
		return true;
	}

	/**
	 * @see com.toparchy.molecule.bi.olap.ui.navigator.MetadataNode#createChildren()
	 */
	@Override
	protected List<TreeNode> createChildren() {
		return Collections.emptyList();
	}
}
