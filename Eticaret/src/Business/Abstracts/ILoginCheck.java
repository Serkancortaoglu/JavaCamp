package Business.Abstracts;

import Entities.Concretes.User;

public interface ILoginCheck {
	
	boolean login(User user);
	boolean register(User user);

}
