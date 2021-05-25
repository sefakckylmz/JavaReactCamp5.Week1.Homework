package nLayeredDemo2.adapter.concretes;

import nLayeredDemo2.adapter.abstracts.RegisterService;
import nLayeredDemo2.dataAccess.abstracts.UserDuo;
import nLayeredDemo2.entities.concretes.User;

public class OperaRegisterManager implements RegisterService {

	UserDuo userdao;
	
	public OperaRegisterManager(UserDuo userdao) {
		this.userdao = userdao;
	}

	@Override
	public void register(User user) {
		System.out.println(user.geteMail()+" opera adresi ile kay�t oldu");		
	}

	@Override
	public void logIn(String email, String password) {
		System.out.println(email+" opera adresi ba�ar�yla giri� yapt�");
		for (User user : userdao.getAll()) {
			
		if(user.geteMail().equals(email) && user.getPassaword().equals(password)) {
			System.out.println(email+" giri�i yap�ld�");
			return;
		}else {
			System.out.println("bilgilerinizi kontrol ediniz");
		}
		
		}
		
	}

}