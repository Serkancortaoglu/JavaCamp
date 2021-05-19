package Entities.Concretes;

import Entities.Abstracts.IEntity;

public class Game implements IEntity {
	
	private int gamePrice;
	private String gameName;
	public Game(int gamePrice, String gameName) {
		super();
		this.gamePrice = gamePrice;
		this.gameName = gameName;
	}
	public Game() {
		
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

}
