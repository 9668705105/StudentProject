package com.nt.gagan.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.gagan.binding.EmployeeBinding;

@Controller
public class EmployeeController {
	
	@GetMapping("/loadform")
	public String loadUserForm(Model model) {
		EmployeeBinding emp=new EmployeeBinding();
		model.addAttribute("user",emp);
		return "index";
	}
	
	@PostMapping("/saveUser")
	public String ShowUserForm(@Valid EmployeeBinding user,BindingResult result,Model model) {
		System.out.println("helllllo");
		if(result.hasErrors()) {
			System.out.println("tumakuuuuuu");
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg","Successfully Registered all the message");
		return "dashboard";
		
	}
	

}
