package com.spring.fuelplease.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class UserAuthHandler implements HandlerInterceptor{

	// 회원 권한이 필요한 페이지 요청이 들어왔을 때, (로그인 성공유저만) 
	// 권한이 없으면 로그인 페이지로 보내버리는 로직
	@Override
	public boolean preHandle(HttpServletRequest request,
							HttpServletResponse response,
							Object handler) throws Exception {
		// 세션에서 로그인 데이터 얻은 후 확인
		HttpSession session = request.getSession();
		
		if(session.getAttribute("login") == null) {
			// 로그인 안함
			response.sendRedirect(request.getContextPath() + "/user/userLogin");
			return false;
		}
		// 로그인 했다면 통과
		return true;
	}
}
