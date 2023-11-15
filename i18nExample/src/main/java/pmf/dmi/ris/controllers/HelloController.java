package pmf.dmi.ris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pmf.dmi.ris.exceptions.MyNullPointerException;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@GetMapping("home")
	public String hello(Model m) throws MyNullPointerException{
		try{
			return "home";

		}catch(Exception e) {
			throw new MyNullPointerException();
		}
	}

}
