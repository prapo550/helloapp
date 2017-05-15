package com.datc.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {	
   @RequestMapping(value = "/hello", method = RequestMethod.POST)
   public String hello(ModelMap model) {
	   String message = "Hello World!!!";
			   
	   model.addAttribute("message", message);
	   return "hello";
   }
}

