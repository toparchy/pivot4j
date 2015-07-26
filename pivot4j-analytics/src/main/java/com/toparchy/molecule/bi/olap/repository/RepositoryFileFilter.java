package com.toparchy.molecule.bi.olap.repository;

public interface RepositoryFileFilter {

	/**
	 * @param file
	 * @return
	 */
	boolean accept(ReportFile file);
}
