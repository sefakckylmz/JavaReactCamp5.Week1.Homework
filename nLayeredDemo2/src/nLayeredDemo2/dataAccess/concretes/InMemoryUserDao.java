package nLayeredDemo2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo2.dataAccess.abstracts.UserDuo;
import nLayeredDemo2.entities.concretes.User;

public class InMemoryUserDao implements UserDuo {
	
	List<User> users;
	
	public InMemoryUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		for (User users : users) {
			if(users.geteMail().equals(users.geteMail())) {
				System.out.println("bu email hali hazýrda bulunmaktadýr.");
				
			}
		}
		users.add(user);
		System.out.println(user.geteMail()+" adlý e mail sisteme eklendi");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.geteMail()+" bellekten silindi");
		
	}

	@Override
	public void update(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
		System.out.println(user.geteMail()+" bellekte güncellendi");
		
	}

	@Override
	public User getId(int id) {
			for (User user : this.users) {
				if(user.getId()==id) {
					return user;
				}
			}
			return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
