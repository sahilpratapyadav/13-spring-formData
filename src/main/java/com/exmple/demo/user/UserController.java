package com.exmple.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	
	//bug id:101
	@GetMapping("/user")
	public ModelAndView loadForm() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("user", new User());
		mav.setViewName("userView");
		
		return mav;
		
	}
	
	
	
	@PostMapping("/user")
	public ModelAndView handSubmit(User user) {
      System.out.println(user);
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Form submited");
		mav.setViewName("userView");
		
		return mav;
		
	}

}


