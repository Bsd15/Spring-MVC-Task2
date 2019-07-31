package com.stackroute.springmvctask2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.springmvctask2.Domain.User;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/greetUser")
	public String greetUser(@RequestParam("username") String username, Model model) {
		User user = new User();
		user.setUserName(username);
		model.addAttribute("user",user);
		return "greetUser";
	}
}
