package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import b.Repository.ProductRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private ProductRepository productjpa;
	
	@GetMapping()
	public String showInHome(HttpServletRequest request, Model model) {
		
		
		
		
		
		
		return "index";
	}
}
