package com.toparchy.molecule.bi.olap.state;

import java.util.EventListener;

public interface ViewStateListener extends EventListener {

	void viewRegistered(ViewStateEvent e);

	void viewUnregistered(ViewStateEvent e);
}
