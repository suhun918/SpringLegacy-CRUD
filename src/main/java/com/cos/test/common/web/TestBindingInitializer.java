package com.cos.test.common.web;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * @Class Name : AraiseBindingInitializer.java
 * @Description : AraiseBindingInitializer Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @since 2009. 03.16
 * @version 1.0
 * @see

 */
public class TestBindingInitializer implements WebBindingInitializer{
	/**
	* initBinder
	* @param binder
	* @param request
	* @see 개발프레임웍크 실행환경 개발팀
	*/
	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
	//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
	//		dateFormat.setLenient(false);
	//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
	}

	
	
}
