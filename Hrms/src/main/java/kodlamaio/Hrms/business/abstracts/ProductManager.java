package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.Product;

public interface ProductManager {

	List<Product> getAll();
	
}
