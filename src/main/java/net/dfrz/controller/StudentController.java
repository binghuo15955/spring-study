package net.dfrz.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	 * 
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

//	@RequestMapping("/get")
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String get() {
		String msg="��ѯ���ݳɹ�";
		
		System.out.println("get");
		return "student/list";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public Student json(ModelMap model) {
		Student student=new Student();
		student.setStuID(UUID.randomUUID().toString().replaceAll("-", ""));
		student.setName("Liuliu");
		student.setBirthday(new Date());
		student.setMobile("15982938421332");
		student.setAddr("����");
		
		model.put("student", student);
		return student;
	}
	
	@RequestMapping("/gets")
	public String gets(ModelMap model)
	{
		Student student = new Student();
		student.setStuID("001");
		student.setName("����");
		student.setBirthday(new Date());
		student.setMobile("13799887234");
		student.setAddr("����");
		
		model.put("student", student);
		
		
		return "student/list"; 
	} 

}
