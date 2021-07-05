package kodlamaio.Hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.concretes.ProductService;
import kodlamaio.Hrms.entities.concretes.Product;



@RestController
@RequestMapping("/api/product")
public class ProductController {

private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService=productService;
	}
		
		@GetMapping("/getall")
		public List<Product>getAll(){
			return this.productService.getAll();
		}
		
	}

