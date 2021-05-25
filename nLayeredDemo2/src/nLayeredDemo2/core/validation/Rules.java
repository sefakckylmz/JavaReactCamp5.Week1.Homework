package nLayeredDemo2.core.validation;



public class Rules {
	
	public static boolean RulesOfName(String firstName,String lastName) {
		if(firstName.length()>2 && lastName.length()>2) {
			return true;
		}else {
			System.out.println("isim ve soyisim en az 3 er karakter olmal�d�r. ");
			return false;
		}
		
	}
	
	public static boolean RulesOfPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			System.out.println("�ifre en az 6 karakterden olu�mal�d�r");
			return false;
		}
	}
	
	public static boolean RulesOfEmailFormat(String email) {
		if(email.matches("^(.+)@(.+)$")) {
			return true;
		}else {
			System.out.println("e mail format� yanl�� girildi"+email);
			return false;
		}
		
		
	}
	
	
}
