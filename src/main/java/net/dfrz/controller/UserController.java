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
		System.out.println("ע��" + user.getUserName());
		System.out.println(errors.getErrorCount());
		if (errors.hasFieldErrors()) {
			System.out.println(errors.getFieldError("userName").getDefaultMessage());
		}
		// ע��ɹ���ֱ����ת����½�ɹ��Ľ���
		// return "forward:login";
		// ����������
		return "redirect:login";
	}

	@RequestMapping("/login")
	public String Login(String userName) {
		System.out.println("��¼" + userName);

		return "";
	}
}
