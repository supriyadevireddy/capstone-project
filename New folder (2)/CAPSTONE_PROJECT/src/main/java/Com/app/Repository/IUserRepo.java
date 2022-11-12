package Com.app.Repository;

import Com.app.Pojo.User;

public interface IUserRepo {
	
	int createUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(int userId);
	
	User getUser(String userName, String pwd);

}

