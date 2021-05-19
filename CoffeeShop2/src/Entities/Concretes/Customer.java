package Entities.Concretes;

import Entities.Abstracts.IEntity;

public class Customer implements IEntity {
	
	private int Id;
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private int birthYear;
	
	public Customer(int id, String firstName, String lastName, String nationaltyId, int birthYear) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.birthYear = birthYear;
	}
	public Customer() {
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
