package net.dfrz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//��������һ��������
@RequestMapping("hw")	//����ӳ�䣬����web.XML��mapping���趨��������·������ʡ�ԣ�������д��
public class HelloWorldController {
	
	@RequestMapping("/hello")	//�趨������������·��������ʱ�������mapping�ϲ���
	public String hello() {
		System.out.println("I DO WORK!");
		return "hello";
	}

}
