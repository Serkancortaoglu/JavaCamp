package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface IUserDao {
	
	void add(User user);
	List<User> getAll();
	
	

}
