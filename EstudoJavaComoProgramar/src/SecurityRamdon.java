import java.security.SecureRandom;

public class SecurityRamdon {

	public static void main(String[] args) {
		SecureRandom numeroSeguro = new SecureRandom();
		
		for (int i = 1; i <= 20; i++) {
			
			int randomico = 1 + numeroSeguro.nextInt(6);
			
			System.out.printf("%d ", randomico);
			
			if (i % 5 == 0) {
				System.out.println();
			}
			
		}

	}

}
