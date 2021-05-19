package Business.Abstracts;

import Entities.Concretes.Company;

public interface ICompanyManager {

	void add(Company company);
	void update(Company company);
	void delete(Company company);
	
	
}
