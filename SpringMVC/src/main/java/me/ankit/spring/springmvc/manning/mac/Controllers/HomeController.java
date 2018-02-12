package me.ankit.spring.springmvc.manning.mac.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@Controller
@RequestMapping("/")
public class HomeController {
	
	public String home(){
		System.out.println("here is home()... comtroller.");
		return "home";
	}

}

*/

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
}
