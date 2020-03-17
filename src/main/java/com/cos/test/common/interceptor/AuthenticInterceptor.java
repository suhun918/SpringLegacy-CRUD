package com.cos.test.common.interceptor;

import java.nio.file.AccessDeniedException;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class AuthenticInterceptor  {
	//extends HandlerInterceptorAdapter
/*	private Set<String> permittedURL;

	public void setPermittedURL(Set<String> permittedURL) {
		this.permittedURL = permittedURL;
	}

	*//**
	 * 세션에 계정정보(user)가 있는지 여부로 인증 여부를 체크한다. 계정정보(user)가 없다면, 로그인 페이지로 이동한다.
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @param Object
	 *            handler
	 * @return boolean
	 * @throws Exception
	 *//*
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String requestURI = request.getRequestURI();//요청 URI

		if (isPermittedURL(request, requestURI)) {
			return true;
		}

		String userId = "";
		SessionVO userVO = null;

		// session check
		if (request.getSession(false) != null) {
			// false를 넣어두면 세션이 존재하면 반환하고 존재하지 않으면 null을 반환한다.
			userVO = (SessionVO) request.getSession().getAttribute("user");
		}

		if (userVO != null) {
			return true;
		} else {
			throw new AccessDeniedException("userId = " + userId + " Session Timeout");
		}
	}
	
	private boolean isPermittedURL(HttpServletRequest request, String requestURI) {
		
		boolean result = false;
		
		for (Iterator<String> it = this.permittedURL.iterator(); it.hasNext();) {
			String urlPattern = request.getContextPath() + (String) it.next();
			
			// 정규표현식을 이용해서 요청 URI가 허용된 URL에 맞는지 점검함.
			if(Pattern.matches(urlPattern, requestURI)) {
				result = true;
			}
			
		}
		return result;
	}*/

}
