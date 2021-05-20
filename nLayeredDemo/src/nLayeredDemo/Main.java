package nLayeredDemo;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.ProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		IProductService service=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product =new Product();
		product.setId(7);
		product.setCategoryId(77);
		product.setName("Laptop");
		product.setUnitsInStock(2);
		
		
		service.add(product);
			
			
	

}
}
