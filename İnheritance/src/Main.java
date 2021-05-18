import java.util.logging.LogManager;

public class Main {

	public static void main(String[] args) {
	
		
		CorporateCustomer customer=new CorporateCustomer();
		customer.customerNumber="87";
		
		IndiviualCustomer customer2=new IndiviualCustomer();
		customer2.customerNumber="41";
		
		CustomerManager manager=new CustomerManager();
		manager.add(customer2);
		manager.add(customer);
		
		
		
		
		
		
	}

}
