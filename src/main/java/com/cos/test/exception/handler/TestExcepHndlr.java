package com.cos.test.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

public class TestExcepHndlr implements ExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestExcepHndlr.class);

	@Override
	public void occur(Exception ex, String packageName) {
		LOGGER.debug(" EgovServiceExceptionHandler run...............");
	}

}
