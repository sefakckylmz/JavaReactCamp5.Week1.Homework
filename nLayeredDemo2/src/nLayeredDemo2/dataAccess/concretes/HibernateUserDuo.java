package nLayeredDemo2.dataAccess.concretes;

import java.util.List;

import nLayeredDemo2.dataAccess.abstracts.UserDuo;
import nLayeredDemo2.entities.concretes.User;

public class HibernateUserDuo implements UserDuo {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kullanýcý eklendi : "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile kullanýcý silindi : "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile kullanýcý güncellendi : "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public User getId(int id) {
		System.out.println("ID ye göre kullanýcý güncellendi");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("veriler hibernate ile listelendi");
		return null;
	}

}
