package net.dfrz.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import net.dfrz.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("register")
	public String register(@Valid User user, Errors errors) {//
		System.out.println("注册" + user.getUserName());
		System.out.println(errors.getErrorCount());
		if (errors.hasFieldErrors()) {
			System.out.println(errors.getFieldError("userName").getDefaultMessage());
		}
		// 注册成功后，直接跳转到登陆成功的界面
		// return "forward:login";
		// 不带参数的
		return "redirect:login";
	}

	@RequestMapping("/login")
	public String Login(String userName) {
		System.out.println("登录" + userName);

		return "";
	}
}
