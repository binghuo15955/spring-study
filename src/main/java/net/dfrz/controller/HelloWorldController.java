package net.dfrz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//声明它是一个控制器
@RequestMapping("hw")	//请求映射，类似web.XML的mapping，设定到类请求路径（可省略，开发会写）
public class HelloWorldController {
	
	@RequestMapping("/hello")	//设定到方法的请求路径（访问时需与类的mapping合并）
	public String hello() {
		System.out.println("I DO WORK!");
		return "hello";
	}

}
