package net.dfrz.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//�ִ����  �Ҷ���ţ
public class FileInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		DefaultMultipartHttpServletRequest myRequest=(DefaultMultipartHttpServletRequest)request;
		
		//��ȡ����չ�������Լ��������չ�������б�Ƚ�
		myRequest.getFileNames();
		
		return super.preHandle(request, response, handler);
	} 
		
}
