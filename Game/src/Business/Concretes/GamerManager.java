package Business.Concretes;

import Business.Abstracts.IGamerManager;
import Business.Abstracts.IMernisSimulasyon;
import Entities.Concretes.Gamer;

public class GamerManager implements IGamerManager {

	private IMernisSimulasyon _sim;
	
	public GamerManager(IMernisSimulasyon sim) {
		
		this._sim=sim;
	}
	
	
	@Override
	public void add(Gamer gamer) {
	if(_sim.CheckrealPerson(gamer)) {
		System.out.println("Check edildi");
	}
	else 
	{
		System.out.println("Check Edilemedi");
	}
	}
	@Override
	public void update(Gamer gamer) {
	System.out.println("Oyuncu güncellendi"+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("Oyuncu güncellendi"+gamer.getFirstName());
	}

}
