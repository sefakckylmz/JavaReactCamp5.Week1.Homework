package nLayeredDemo2.core.verification;

public class VerificationEmail {
	
	public static void sendVerificationEmail(String email) {
		System.out.println(email+" adresine do�rulama kodu g�nderildi.");
	}
	public static void completeVerificationEmail(String email) {
		System.out.println(email+" adresine gelen do�rulama kodu onayland�.");
	}
	
}
