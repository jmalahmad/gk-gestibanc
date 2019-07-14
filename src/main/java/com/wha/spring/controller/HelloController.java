package com.wha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@Autowired
	/*
	 * inject BusinessService 
	 */
	
	@RequestMapping(value = "/HelloController", method=RequestMethod.GET)
	public String authentification() {
		/*
		 * perform Business Tasks
		 */
		if(Math.random()>0.5)
			return "succes";
		return "erreur";
	}
}
