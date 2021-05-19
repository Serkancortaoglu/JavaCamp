package Entities.Concretes;

import Entities.Abstracts.IEntity;

public class Gamer implements IEntity {
	
	private int IdentiytNumber;
	private String FirstName;
	private String LastName;
	private int BirthYear;
	public Gamer(int identiytNumber, String firstName, String lastName, int birthYear) {
		super();
		this.IdentiytNumber = identiytNumber;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.BirthYear = birthYear;
	}
	public Gamer() {
		
	}
	public int getIdentiytNumber() {
		return IdentiytNumber;
	}
	public void setIdentiytNumber(int identiytNumber) {
		this.IdentiytNumber = identiytNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthYear(int birthYear) {
		this.BirthYear = birthYear;
	}
	

	

	

}
