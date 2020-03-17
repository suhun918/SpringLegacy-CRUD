package com.cos.test.common.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cos.test.common.util.MessageSource;


/**
 * 인증여부 체크 실패 시  인터셉터
 * @author hyi
 * @since 2017.11.28
 * @version 1.0
 * @see
 */
public class LoginFailureHandler {
	
//	@Autowired
//	private AdminMapper adminMapper;
//	
//	@Autowired
//	MessageSource messageSource;
//	
//	private Logger logger = LoggerFactory.getLogger(LoginFailureHandler.class);
//	
//	private String formUsernameKey = UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY;
//	
//	@Override
//	public void onAuthenticationFailure(HttpServletRequest request
//			, HttpServletResponse response
//			, AuthenticationException auth) throws IOException, ServletException {
//		
//		try {
//			
//			String loginId = request.getParameter(formUsernameKey);
//			
//			SessionVO sessionVO = new SessionVO();
//			sessionVO.setUsername(loginId);
//			
//			SessionVO resultVO = new SessionVO();
//			resultVO = adminMapper.
//		} catch (Exception e) {
//			logger.error(e.getMessage());
//		}
//		
//	}
	
}
