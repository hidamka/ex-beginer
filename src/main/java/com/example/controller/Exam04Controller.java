package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/result")
	public String result (@Validated UserForm userForm, BindingResult result, RedirectAttributes redirectAttributes) {
	
		//もしエラーがあった場合は入力画面に遷移
		if(result.hasErrors()) {
			//入力画面用のメソッドを呼び入力画面に戻る
			return "exam04";
			}
		User user = new User();
		user.setName(userForm.getName());
		user.setAge(userForm.getAge());
		user.setComment(userForm.getComment());
		
		return "exam04-result";
	}
}
