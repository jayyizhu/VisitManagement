package com.visitman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/mobile")
	public String mobie() {
		return "mobileMain2";
	}
	
	@RequestMapping("/region")
	public String region() {
		return "region";
	}
	/*
	@RequestMapping(value = "/VisitResult", method = RequestMethod.POST)
    public String VisitResult(@RequestBody User user, Model model){
		User loginUser = new User(user.getId(),user.getName(),user.getPassword());
		if (user.getName().equals("admin") && user.getPassword().equals("123456")){
			model.addAttribute("user", loginUser);
			System.out.print("验证成功");
			return "home";
		}else{
			model.addAttribute("errorMsg", "用户名或者密码错误!");
			System.out.print("验证失败");
			return "error";
		}
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user, Model model){
		User loginUser = new User(user.getId(),user.getName(),user.getPassword());
		if (user.getName().equals("admin") && user.getPassword().equals("123456")){
			model.addAttribute("user", loginUser);
			System.out.print("验证成功");
			return "home";
		}else{
			model.addAttribute("errorMsg", "用户名或者密码错误!");
			System.out.print("验证失败");
			return "error";
		}
    }
	
	@RequestMapping("/test")
	public String testing() {
		return "test";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String updateEmployee(@RequestBody Employee employee, Model model){

        Employee newEm = new Employee(employee.getId(),employee.getName(),employee.getTitle());
        model.addAttribute("emp", newEm);
        return "hello";
    }
    
	@RequestMapping(value="/test", method = RequestMethod.POST)
    public String test(@RequestParam("username") String name, @RequestParam("password") String pwd, Model model) {
        model.addAttribute("username", name);
        model.addAttribute("password", pwd);
        return "hello";
    }
	
	@RequestMapping("/hello2")
    public String hello( Model model) {
		Employee newEm = new Employee("tttt", "ggg", "hhh");
        model.addAttribute("emp", newEm);
        return "hello";
    }
	
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name, @RequestParam("password") String pwd, Model model) {
        model.addAttribute("username", name);
        model.addAttribute("password", pwd);
        return "hello";
    }
    */
}