package Business.Concretes;

import Business.Abstracts.ILoginCheck;
import Business.Abstracts.IUserService;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserCheck implements ILoginCheck {

	
	private IUserService _service;
	
	public UserCheck(IUserService service){
		this._service=service;
		
		
	}
	
	
	public boolean login(User user) {
	if(_service.checkMail(user)==true && _service.checkPassword(user)==true) {
		System.out.println("Ýþlem hatasýz");
		return true;
	}else {
		System.out.println("Ýþlem hatalý");
		return false;
	}
	
		
		
		
	}

	@Override
	public boolean register(User user) {
	if(_service.checkName(user)==true && _service.checkPassword(user)==true && _service.checkPassword(user)==true) {
		
		System.out.println("Eklendi");
		return true;
	}
		
		
		
		return false;
	}

}
