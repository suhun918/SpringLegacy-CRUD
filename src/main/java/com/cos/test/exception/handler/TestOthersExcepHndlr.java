package com.cos.test.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

public class TestOthersExcepHndlr implements ExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestOthersExcepHndlr.class);

	@Override
	public void occur(Exception arg0, String arg1) {
		LOGGER.debug(" EgovServiceExceptionHandler run...............");
	}
	
}
