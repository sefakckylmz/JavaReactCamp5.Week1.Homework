package nLayeredDemo2.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo2.entities.concretes.User;

public interface UserDuo {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getId(int id);
	 List<User> getAll(); 
}
