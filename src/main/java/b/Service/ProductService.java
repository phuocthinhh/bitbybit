package b.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productjpa;
	
	
}
