package Entities.Concretes;

import Entities.Abstracts.IEntity;

public class Company implements IEntity {

	private String companyName;
	private int companyDiscount;
	
	public Company() {
		super();
	}
	public Company(String companyName, int companyDiscount) {
		super();
		this.companyName = companyName;
		this.companyDiscount = companyDiscount;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCompanyDiscount() {
		return companyDiscount;
	}
	public void setCompanyDiscount(int companyDiscount) {
		this.companyDiscount = companyDiscount;
	}
	
}
