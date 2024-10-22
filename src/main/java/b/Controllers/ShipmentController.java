package b.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import b.Repository.UserRepository;


@Controller
public class ShipmentController {
	@Autowired
	UserRepository userjpa;
	
	@GetMapping("/shipments")
	public String getShipments(Model model) {
		
		return "Shipment";
	}
	@RequestMapping("/shipments")
	public String doShip(Model model) {
		
		return "Shipment";
	}
	
}
