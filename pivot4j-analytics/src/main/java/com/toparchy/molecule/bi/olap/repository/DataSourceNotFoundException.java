package com.toparchy.molecule.bi.olap.repository;

import com.toparchy.molecule.bi.olap.datasource.ConnectionInfo;

public class DataSourceNotFoundException extends Exception {

	private static final long serialVersionUID = -6634494832895522425L;
	
	private ConnectionInfo connectionInfo;

	/**
	 * @param connectionInfo
	 */
	public DataSourceNotFoundException(ConnectionInfo connectionInfo) {
		this.connectionInfo = connectionInfo;
	}

	/**
	 * @return the connectionInfo
	 */
	public ConnectionInfo getConnectionInfo() {
		return connectionInfo;
	}
}
