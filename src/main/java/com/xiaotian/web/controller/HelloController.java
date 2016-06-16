package com.xiaotian.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xiaotian.common.Customer;
import com.xiaotian.web.model.User;
import com.xiaotian.web.service.Service;
import com.xiaotian.web.service.ServiceIn;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public ModelAndView hello1() {

		ModelAndView model = new ModelAndView();
		model.setViewName("NewFile1");
		

		return model;

	}
	

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello1(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public ModelAndView hello2() {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello2");
		model.addObject("msg", "wangyunsi");

		return model;

	}
	
	
	@RequestMapping(value = "/ajaxfinal", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInJSON() {

		Shop shop = new Shop();
		shop.setName("sisi");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return shop;

	}
	
	
	
	
	
	@RequestMapping(value = "/ajax", method = RequestMethod.GET)
	public ModelAndView ajax() {

		ModelAndView model = new ModelAndView();
		model.setViewName("ajax");
		model.addObject("msg", "wangyunsi");

		return model;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/print", method = RequestMethod.POST)
	public ModelAndView print(@RequestParam("username")String name,@RequestParam("userage")int age) {

		ModelAndView model = new ModelAndView();
		
		User user=new User();
	user.setName(name);
	user.setAge(age);
	
	User user2=new User();
	
	user2.setName("nimei");
	user2.setAge(3);
		
	List<User> list=new ArrayList<User>();
	list.add(user);
	list.add(user2);
		model.setViewName("hello2");
		model.addObject("msg", "name:"+name+" age:"+age);
		model.addObject("user1",list);
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBB.xml");

		ServiceIn se = (ServiceIn) context.getBean("ServiceBean");
		System.out.println(se.getList());
		
		
		
		
		

		return model;

	}
	
	

	}
	
	
	

