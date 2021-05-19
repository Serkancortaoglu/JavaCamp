package Business.Concretes;

import Business.Abstracts.ICompanyManager;
import Entities.Concretes.Company;

public class CompanyManager implements ICompanyManager {

	@Override
	public void add(Company company) {
		System.out.println("Kampanya eklendi"+company.getCompanyName());
		
	}

	@Override
	public void update(Company company) {
		System.out.println("Kampanya güncellendi"+company.getCompanyDiscount());
		
	}

	@Override
	public void delete(Company company) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya silindi"+company.getCompanyName());
		
	}

}
