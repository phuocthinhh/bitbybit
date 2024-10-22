package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import b.Repository.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productjpa;
	
	@GetMapping("/")
	public String getProduct(Model model) {
		
		return "Product";
	}
	@RequestMapping("/search")
	public String doSearch(@RequestParam("query") String query,Model model) {
		
		return "Product";
	}
	
}
