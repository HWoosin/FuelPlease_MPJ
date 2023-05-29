package com.spring.fuelplease.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserLoginSuccessHandler implements HandlerInterceptor{

	// preHandle: 컨트롤러로 요청이 들어가기 전 처리해야 할 로직 작성
	@Override
	public boolean preHandle(HttpServletRequest request, 
							HttpServletResponse response, 
							Object handler) throws Exception {
		log.info("preHandle 동작!");
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	// postHandle은 컨트롤러를 나갈 때 공통 처리해야 할 내용을 작성.
	// /userLogin이라는 요청이 마무리 된 후 viewResolver로 전달이 되기 전
	// 로그인 성공 / 실패 여부에 따라 처리 할 로직을 작성.
	
	
	public void postHandle(HttpServletRequest request, 
					HttpServletResponse response,
					Object handler,
					ModelAndView modelAndView) throws Exception {
		
		log.info("로그인 인터셉터 동작!");
		log.info("요청방식: {}", request.getMethod());
		
		if(request.getMethod().equals("POST")) {
			ModelMap map = modelAndView.getModelMap();
			String id = (String) map.get("user");
			
			//log.info("인터셉터 내부 user데이터 확인: {}", id); // 합친 후 확인 필요 
						
			if(id != null) {
				log.info("로그인 성공 로직 동작!");
				
				// 로그인 성공 회원 세션데이터 생성하여 로그인 유지해주는 로직
				HttpSession session = request.getSession();
				session.setAttribute("login", id);
				response.sendRedirect(request.getContextPath() + "/");
				
				// 로그인 실패 시	
			} else { 
				modelAndView.addObject("msg","loginFail");
			}
		}
	}
}
