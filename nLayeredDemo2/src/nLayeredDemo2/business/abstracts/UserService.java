package nLayeredDemo2.business.abstracts;

import nLayeredDemo2.entities.concretes.User;

public interface UserService {

	void register(User user);
	void logIn(String email,String password);
	void logOut();
	
	
}
