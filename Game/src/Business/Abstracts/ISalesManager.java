package Business.Abstracts;

import Entities.Concretes.Company;
import Entities.Concretes.Game;

import Entities.Concretes.Sales;

public interface ISalesManager {

	void Sale(Game game,Sales sales);
	void SaleCompanyPrice(Company company,Sales sales);
	
}
