package Business.Concretes;

import Business.Abstracts.ISalesManager;
import Entities.Concretes.Company;
import Entities.Concretes.Game;

import Entities.Concretes.Sales;

public class SalesManager implements ISalesManager {

	@Override
	public void Sale(Game game,Sales sales) {
		System.out.println("Satýþ yapýldý "+sales.getUnitPrice());
		
	}

	@Override
	public void SaleCompanyPrice(Company company,Sales sales) {
		
		System.out.println("Satýþ kampanya fiyatý "+company.getCompanyDiscount()+sales.getUnitPrice());
		
		
	}



	
}
