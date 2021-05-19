package Business.Concretes;

import Business.Abstracts.ICustomerManager;
import Entities.Concretes.Customer;

public class BaseCustomerManager implements ICustomerManager {

	@Override
	public void add(Customer customer) {
		System.out.println("Eklendi"+ customer.getFirstName());
		
		
	}

}
