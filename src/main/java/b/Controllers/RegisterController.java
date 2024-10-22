package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import b.Repository.UserRepository;


@Controller
public class RegisterController {
	@Autowired
	UserRepository userjpa;
	
	@RequestMapping("/signup")
	public String signUp(Model model) {
		
		return "SignUp";
	}
	@RequestMapping("/doSignUp")
	public String doSignUp(Model model) {
		
		return "redirect:/Login";
	}
	
		
}
