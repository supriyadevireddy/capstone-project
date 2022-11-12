package Com.app.Service;

import Com.app.Pojo.User;

public interface IUserSrv {
	
	String createUser(User user);
	
	String updateUser(User user);
	
	String deleteUser(int userId);
	
	User getUser(String userName, String pwd);

}
