package nLayeredDemo2.core.verification;

public class VerificationEmail {
	
	public static void sendVerificationEmail(String email) {
		System.out.println(email+" adresine doðrulama kodu gönderildi.");
	}
	public static void completeVerificationEmail(String email) {
		System.out.println(email+" adresine gelen doðrulama kodu onaylandý.");
	}
	
}
