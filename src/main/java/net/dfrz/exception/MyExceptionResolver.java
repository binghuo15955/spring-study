package net.dfrz.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mv=new ModelAndView();
		if(ex instanceof Exception) {
			mv.addObject("ex",ex);
			mv.setViewName("/exception/home");
			return mv;
		}
		
		return null;
	}
	

}
