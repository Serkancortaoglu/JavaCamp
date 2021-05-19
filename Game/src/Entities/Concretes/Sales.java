package Entities.Concretes;

import Entities.Abstracts.IEntity;

public class Sales implements IEntity{

	private int UnitPrice;

	public Sales(int unitPrice) {
		super();
		this.UnitPrice = unitPrice;
	}
	public Sales() {
		
	}
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.UnitPrice = unitPrice;
	}
	
}
