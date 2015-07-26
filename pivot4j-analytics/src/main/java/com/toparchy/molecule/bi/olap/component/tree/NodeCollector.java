package com.toparchy.molecule.bi.olap.component.tree;

import org.primefaces.model.TreeNode;

public interface NodeCollector {

	boolean collectNode(TreeNode node);

	boolean searchNode(TreeNode node);
}
