package nLayeredDemo2.adapter.abstracts;

import nLayeredDemo2.entities.concretes.User;

public interface RegisterService {
	public void register(User user);
	public void logIn(String email,String password);
}
