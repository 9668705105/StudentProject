package com.nt.gagan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class book {
	@GetMapping("/history")
	public String Register() {
		    String msg="Hii Gagan till now no job";
		return msg;
	}

}
