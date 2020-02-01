import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		// Ask user for menu selection input and scan it
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter 1 for Encrypter or 2 for Decrypter: ");
		int menuselection = in.nextInt();
		in.nextLine();
		
		// 1st selection is for encryption
		if(menuselection == 1) {
			System.out.printf("Enter a 4 digit Number to encrypt: ");
			String num = in.nextLine();
			System.out.println("The encrypted number is " + Encrypter.encrypt(num));
		}
		
		// 2nd selection is for decryption
		else if(menuselection == 2) {
				System.out.println("Enter a 4 digit Number to decrypt: ");
				String num2 = in.nextLine();
				System.out.println("The decrypted number is " + Decrypter.decrypt(num2));
		}
	}
}

