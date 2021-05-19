package Business.Concretes;

import Business.Abstracts.IMernisSimulasyon;
import Entities.Concretes.Gamer;

public class MernisSimulasyon implements IMernisSimulasyon {

	@Override
	public boolean CheckrealPerson(Gamer gamer) {
		System.out.println("Mernis eklendi");
		return true;
	}

	

}
