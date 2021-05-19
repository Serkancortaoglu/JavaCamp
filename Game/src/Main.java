import Business.Concretes.GamerManager;
import Business.Concretes.MernisSimulasyon;
import Entities.Concretes.Gamer;

public class Main {

	public static void main(String[] args) {
	Gamer gamer=new Gamer();
	gamer.setFirstName("Mert");
	gamer.setLastName("Gezer");
	gamer.setBirthYear(1997);
	gamer.setIdentiytNumber(4677);
	
	
	
	GamerManager manager=new GamerManager(new MernisSimulasyon());
	manager.add(gamer);

	}

}
