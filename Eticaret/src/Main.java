
import Business.Abstracts.ILoginCheck;
import Business.Abstracts.IUserService;
import Business.Concretes.UserCheck;
import Business.Concretes.UserManager;
import DataAccess.Concretes.UserDao;
import Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setFirstName("Serkan");
		user.setLastName("C");
		user.setPassword("12131313");
		user.setEmail("Cortaoglu");
		
		
		ILoginCheck check=new UserCheck(new UserManager(new UserDao()));
		check.login(user);
		
		
		
		
		
		

	

}
}
