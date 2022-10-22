package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcl.model.User;

@Controller
public class FormController {
    @GetMapping(value= {"/","/register"})
	public String loadForm() {
		
        return "register";
	}
    
    @PostMapping("/register")
	public String handleSubmitBtn(User user,Model model) {
		/*
		 * //Capturing data from Request object String uname=req.getParameter("uname");
		 * System.out.println("username::"+uname); String pwd=req.getParameter("pwd");
		 * System.out.println("Password::"+pwd);
		 * 
		 * String email=req.getParameter("email"); System.out.println("Email::"+email);
		 * 
		 * String phno=req.getParameter("phno");
		 * System.out.println("Phone number::"+phno);
		 */
    	//Sending data from Controller to UI
    	 
    	 String succMsg="Registration completed Successfully";
    	 model.addAttribute("msg",succMsg);
    	
    	 //Returning Logicla View Name
    	 
		return "registerSuccess";
	}
}
