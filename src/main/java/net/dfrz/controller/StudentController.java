package net.dfrz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import net.dfrz.entity.Student;

@Controller
@RequestMapping("student")
public class StudentController {
	/**
	 * JSP ǰ�˴���
	 * 1.�������������ϴ�:
	 * String stuID,String name,Date birthday,String mobile,String addr
	 * 
	 * 2.��������������--Student student
	 * 
	 * 3.����ԭ����servlet���� HttpServletRequest request
	 * 
	 * 4.ǿ��������@requestparam:@RequestParam("name1")
	 * 
	 * 5.@PathVariable-->restful:
	 * @RequestMapping("/add/{stuid}/{name}")
	 * ����@PathVariable("stuid") String stuID,@PathVariable("name") String name
	 * 
	 * 6.����JSON��ʽ
	 * @return
	 */
	@RequestMapping("/add")
	public String add(@RequestBody String stuID,@RequestBody String name) {
//		String Stuname=request.getParameter("name");
		System.out.println("add");
//		System.out.println(Stuname);
//		System.out.println(student.getName());
		return "";
	}

	@RequestMapping("/del")
	public String del() {
		System.out.println("del");
		return "";
	}

	@RequestMapping("/upt")
	public String upt() {
		System.out.println("upt");
		return "";
	}

	@RequestMapping("/get")
	public String get() {
		System.out.println("get");
		return "";
	}

}
