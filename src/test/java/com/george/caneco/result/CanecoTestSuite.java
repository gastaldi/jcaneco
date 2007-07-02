package com.george.caneco.result;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CanecoTestSuite {

	public static Test suite() {
		TestSuite ts = new TestSuite();
		ts.addTestSuite(ConstanteTest.class);
		ts.addTestSuite(FulaTest.class);
		ts.addTestSuite(QuinaTest.class);
		return ts;
	}
}
