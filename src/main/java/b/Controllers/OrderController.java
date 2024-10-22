package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import b.Repository.CartRepository;
import b.Repository.ProductRepository;
import b.Repository.UserRepository;
import b.Service.SessionService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	UserRepository userjpa;
	@Autowired
	ProductRepository productjpa;
	@Autowired
	SessionService session;
	@Autowired
	CartRepository cartjpa;
	
	
}
