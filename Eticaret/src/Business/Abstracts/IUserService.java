package Business.Abstracts;

import Entities.Concretes.User;

public interface IUserService {
	
	boolean checkPassword(User user);
	boolean checkName(User user);
	boolean checkMail(User user);
	void verificationLink(User user);
	void verificationTic(User user);


}
