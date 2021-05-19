package Business.Concretes;

import Business.Abstracts.ISalesManager;
import Entities.Concretes.Company;
import Entities.Concretes.Game;

import Entities.Concretes.Sales;

public class SalesManager implements ISalesManager {

	@Override
	public void Sale(Game game,Sales sales) {
		System.out.println("Sat�� yap�ld� "+sales.getUnitPrice());
		
	}

	@Override
	public void SaleCompanyPrice(Company company,Sales sales) {
		
		System.out.println("Sat�� kampanya fiyat� "+company.getCompanyDiscount()+sales.getUnitPrice());
		
		
	}



	
}
