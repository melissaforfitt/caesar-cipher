import java.util.Scanner;

public class Encryption {

	static int cipher;
	static int plain;
	static String ciphertext = "";
	static String plaintext = ""; 
	
	public static String encrypt(String plaintext, int key) {

		// Encrypts the word using Caesar cipher
		for (int i = 0; i < plaintext.length(); i++) {
			cipher = (int) plaintext.charAt(i) - (int) 'a' + key;
			ciphertext = ciphertext + String.valueOf((char) (cipher + 64));
		}

		return ciphertext;

	}

	public static String decrypt(String ciphertext, int key) {

		// Decrypts the word using Caesar cipher
		for (int i = 0; i < ciphertext.length(); i++) {
			plain = (int) ciphertext.charAt(i) - (int) 'a' - key;
			plaintext = plaintext + String.valueOf((char) (plain + 64));
		}

		return plaintext;

	}

	public static void main(String[] args) {

		String plaintext;
		String ciphertext;
		int key;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the plaintext:");
		plaintext = scan.nextLine();
		System.out.println("Enter the key:");
		key = scan.nextInt();

		ciphertext = encrypt(plaintext, key);
		System.out.println("Encrypted word is: " + ciphertext);
		
		plaintext = decrypt(ciphertext, key);
		System.out.println("Decrypted word is: " + plaintext);

		scan.close();
	}
}