package com.cos.test.common.util;

import java.util.Locale;

import org.springframework.stereotype.Component;

import egovframework.com.cmm.EgovMessageSource;


/**
 * 메시지 리소스 사용을 위한 MessageSource EgovMessageSource 클래스의 상속
 * @author joDh
 * @since 2017.11.23
 * @version 1.0
 * @see
 */

@Component("messageSoruce")
public class MessageSource extends EgovMessageSource {
	public String getMessage(String code, Object[] args) {
		return getReloadableResourceBundleMessageSource().getMessage(code,
				args, Locale.getDefault());
	}
}
