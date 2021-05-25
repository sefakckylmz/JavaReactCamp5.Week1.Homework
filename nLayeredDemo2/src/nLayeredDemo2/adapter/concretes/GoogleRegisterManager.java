package nLayeredDemo2.adapter.concretes;

import nLayeredDemo2.adapter.abstracts.RegisterService;
import nLayeredDemo2.dataAccess.abstracts.UserDuo;
import nLayeredDemo2.entities.concretes.User;

public class GoogleRegisterManager implements RegisterService {

	UserDuo userdao;
	
	public GoogleRegisterManager(UserDuo userdao) {
		this.userdao = userdao;
	}

	@Override
	public void register(User user) {
		System.out.println(user.geteMail()+" google adresi ile kayýt oldu");		
	}

	@Override
	public void logIn(String email, String password) {
		System.out.println(email+" google adresi baþarýyla giriþ yaptý");
		for (User user : userdao.getAll()) {
			
		if(user.geteMail().equals(email) && user.getPassaword().equals(password)) {
			System.out.println(email+" giriþi yapýldý");
			return;
		}else {
			System.out.println("bilgilerinizi kontrol ediniz");
		}
		
		}
		
	}

}
