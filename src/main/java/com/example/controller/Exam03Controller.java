package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Integer item1, Integer item2, Integer item3) {
		Integer price = item1+item2+item3;
		Integer taxprice = (int)(price*1.1);
		application.setAttribute("price", price);
		application.setAttribute("taxprice",taxprice);
		return "exam03-result";
	}

}
