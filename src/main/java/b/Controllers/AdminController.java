package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import b.Repository.ProductRepository;
import b.Repository.UserRepository;
import b.Service.SessionService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	ProductRepository productjpa;
	@Autowired
	UserRepository userjpa;
	@Autowired
	SessionService session;
	
	
	
}
