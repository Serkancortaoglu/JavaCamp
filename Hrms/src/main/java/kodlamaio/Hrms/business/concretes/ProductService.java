package kodlamaio.Hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ProductManager;
import kodlamaio.Hrms.dataAccess.abstracts.ProductDao;
import kodlamaio.Hrms.entities.concretes.Product;


@Service
public class ProductService implements ProductManager {
	
	
	ProductDao productdao;
	
	public ProductService(ProductDao productdao) {
		this.productdao=productdao;
	}
	

	@Override
	public List<Product> getAll() {
		return this.productdao.findAll();
		
		
	
	}

	

	
	
}
