
import Adapters.MernisAdapter;
import Business.Concretes.BaseCustomerManager;
import Business.Concretes.CheckPerson;
import DataAccess.Concretes.NeroManager;
import DataAccess.Concretes.StarbucksManager;
import Entities.Concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setFirstName("Seko");
		customer.setLastName("Cortaoglu");
		customer.setId(7);
		customer.setBirthYear(1998);
		customer.setNationaltyId("46771");
		
		
		BaseCustomerManager manager=new StarbucksManager(new MernisAdapter());
		manager.add(customer);
		
		
		

	}

}
