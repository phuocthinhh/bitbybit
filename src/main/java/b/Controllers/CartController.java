package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import b.Repository.ProductRepository;
import b.Repository.UserRepository;
import b.Service.SessionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	UserRepository userjpa;
	@Autowired
	ProductRepository productjpa;
	@Autowired
	SessionService session;
	
	@GetMapping("/cart")
	public String getCart(Model model) {
		
		return "Cart";
	}
	@PostMapping("/addtocart")
	public String addToCart(@RequestParam("productId") Long productId) {
		
		return "redirect:/Cart";
	}
	@GetMapping("/cart")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
}
