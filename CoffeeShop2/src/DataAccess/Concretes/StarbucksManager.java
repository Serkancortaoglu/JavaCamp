package DataAccess.Concretes;

import Business.Abstracts.ICheckPerson;
import Business.Concretes.BaseCustomerManager;
import Entities.Concretes.Customer;


public class StarbucksManager extends BaseCustomerManager {
	
	 private ICheckPerson _checkPerson;
		public StarbucksManager(ICheckPerson checkPerson) {
			this._checkPerson=checkPerson;
			
		}
	public void add(Customer customer) {
		
		if(_checkPerson.Save(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Hatalý kaydedilme");
		}
		
	}

}
