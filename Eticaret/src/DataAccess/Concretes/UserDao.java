package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserDao implements IUserDao {

	public List<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
	System.out.println("Eklendi user "+user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
				
	}

}
