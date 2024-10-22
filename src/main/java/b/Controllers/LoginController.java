package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import b.Repository.UserRepository;
import b.Service.SessionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class LoginController {
	@Autowired
	UserRepository userjpa;	
	@Autowired
	SessionService session;
	
	@RequestMapping("/login")
	public String Login(Model model) {
		
		return "Login";
	}
	@PostMapping("login")
	public String doLogin(Model model) {
		
		return "Login";
	}
	@RequestMapping("/logout")
	public String doLogOut(Model model) {
		return "redirect:/index";
	}
	
}
