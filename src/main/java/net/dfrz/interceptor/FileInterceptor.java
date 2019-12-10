package net.dfrz.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//分词组件  庖丁解牛
public class FileInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		DefaultMultipartHttpServletRequest myRequest=(DefaultMultipartHttpServletRequest)request;
		
		//获取到扩展名后与自己定义的扩展名允许列表比较
		myRequest.getFileNames();
		
		return super.preHandle(request, response, handler);
	} 
		
}
