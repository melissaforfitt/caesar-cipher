import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		String plaintext;
		int key;
		int cipher;
		String ciphertext = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the plaintext:");
		plaintext = scan.nextLine();
		System.out.println("Enter the key:");
		key = scan.nextInt();

		// Encrypts the word using Caesar cipher
		for (int i = 0; i < plaintext.length(); i++) {
			cipher = (int) plaintext.charAt(i) - (int) 'a' + key;
			ciphertext = ciphertext + String.valueOf((char) (cipher + 64));
		}
		System.out.println("Encrypted word is:" + ciphertext);
		
		for (int i = 0; i < ciphertext.length(); i++) {
			
			
			
		}
		
		
		
		
		scan.close();
	}
}