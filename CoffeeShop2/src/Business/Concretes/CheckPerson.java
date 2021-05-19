package Business.Concretes;

import Business.Abstracts.ICheckPerson;
import Entities.Concretes.Customer;

public class CheckPerson implements ICheckPerson{

	@Override
	public boolean Save(Customer customer) {
		System.out.println("Kaydedildi "+ customer.getFirstName());
		return true;
	}

}
