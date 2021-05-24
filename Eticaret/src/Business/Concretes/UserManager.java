package Business.Concretes;

import Business.Abstracts.IUserService;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserManager implements IUserService {

	
	
	private IUserDao _dao;
	
	public UserManager(IUserDao dao) {
		
		this._dao=dao;
	}
	@Override
	public boolean checkPassword(User user) {
		
	if(user.getPassword().length()>5) {
		System.out.println("Þifreniz geçerli");
		return true;
		
		
	}
	else {
		return false;
		
	}
		
		
		
	}

	@Override
	public boolean checkName(User user) {
	
		if (user.getFirstName().length() > 2 || user.getLastName().length() > 2 ) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	@Override
	public boolean checkMail(User user) {
for(User _user:_dao.getAll()) {
	if(user.getEmail()==_user.getEmail()) {
		return false;
	}
}
	
		
		return true;
	}

	@Override
	public void verificationLink(User user) {
		System.out.println("Dogrulama linki ");
		
	}

	@Override
	public void verificationTic(User user) {
		System.out.println("Dogrulama tiki");
	}

}
