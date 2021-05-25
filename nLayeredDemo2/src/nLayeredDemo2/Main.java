package nLayeredDemo2;

import nLayeredDemo2.adapter.concretes.GoogleRegisterManager;
import nLayeredDemo2.business.concretes.UserManager;
import nLayeredDemo2.core.verification.VerificationEmail;
import nLayeredDemo2.dataAccess.concretes.InMemoryUserDao;
import nLayeredDemo2.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		User user=new User(1, "Sefa","Küçükyýlmaz","sefakucukyilmaz3@hotmail.com", "1111111");
		User user2=new User(2, "Emir","Dur","sefakucukyilmaz4@hotmail.com", "222222");
		User user3=new User(3, "Kerem","Gül","kero@gmail.com", "1333333");

		UserManager userManager=new UserManager(new GoogleRegisterManager(new InMemoryUserDao()));
		
		System.out.println("KULLANICI EKLEME");
		userManager.register(user);
		System.out.println("----------------------------");
		userManager.register(user2);
		System.out.println("----------------------------");
		userManager.register(user3);
		
		System.out.println(" MAIL DOGRULAMA ");
		VerificationEmail.completeVerificationEmail(user.geteMail());
		
		System.out.println(" LOGIN ");
		userManager.logIn("sefakucukyilmaz3@gmail.com","1111111");
		System.out.println("--------------------------------------");
		
		userManager.logIn("emirD@gmail.com","222222");
		
		System.out.println("----------------CIKIS----------------------");
		userManager.logOut();
		
	}

}
