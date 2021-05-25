package nLayeredDemo2.business.concretes;

import nLayeredDemo2.adapter.abstracts.RegisterService;
import nLayeredDemo2.business.abstracts.UserService;
import nLayeredDemo2.core.validation.Rules;
import nLayeredDemo2.core.verification.VerificationEmail;
import nLayeredDemo2.dataAccess.abstracts.UserDuo;
import nLayeredDemo2.entities.concretes.User;

public class UserManager  implements UserService{
	
	RegisterService registerService;

	public UserManager(RegisterService registerService) {
		
		this.registerService = registerService;
	}

	@Override
	public void register(User user) {
		if(Rules.RulesOfName(user.getFirstName(),user.getLastName())&&
				Rules.RulesOfPassword(user.getPassaword())&&
				Rules.RulesOfEmailFormat(user.geteMail())) {
			registerService.register(user);
			VerificationEmail.sendVerificationEmail(user.geteMail());
		}
		
	}

	@Override
	public void logIn(String email, String password) {
		registerService.logIn(email, password);
		
	}

	@Override
	public void logOut() {
		System.out.println("çýkýþ yapýldý");
		
	}

	

	
	

	
	
	
}
