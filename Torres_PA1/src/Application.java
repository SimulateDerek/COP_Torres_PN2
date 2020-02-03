import java.util.Scanner;



public class Application {

	static Scanner scnr = new Scanner(System.in);
	static int systemNum = 0;

	
	public static int EncryptOrDecrypt() {
			
		System.out.println("Enter 1 to Encrypt or 2 to Decrypt");

		while(systemNum  < 1 || systemNum > 2) {
			systemNum = scnr.nextInt();
			if(systemNum  < 1 || systemNum > 2) {
				System.out.println("Please enter either 1 to Encrypt or 2 to Decrypt: ");
			}
		}
		return systemNum;
		
	}

	/*
	 * Your application should read a four-digit integer entered by the user
	 *  and encrypt it as follows:
	 *   Replace each digit with the result of adding 7 to the digit
	 *    and getting the remainder after dividing the new value by 10.
	 *     Then swap the first digit with the third,
	 *      and swap the second digit with the fourth.
	 *       Then print the encrypted integer.
	 *        allow the user to enter an encrypted four-digit integer
	 *         and then decrypt it (by reversing the encryption scheme)
	 *          to form the original number.
	 */
	
	//Prompt User to Encrypt or Decrypt
	
	public static void main(String[] args) {
						
		systemNum = EncryptOrDecrypt();
		
		int userInput = 10000;
		
		while (userInput >9999) {
			
			System.out.println("Please enter a four digit integer to Encrypt:");
			userInput = scnr.nextInt();
			if(userInput >9999) {
				System.out.println("Integer was not between 1000 and 9999.");
			}
		}
		
		if(systemNum == 1) {
			int encryptedNum = Encrypter.encrypt(userInput);
			System.out.printf("Your encrypted value is %04d" , encryptedNum);
		}
		
		if(systemNum == 2) {
			int decryptedNum = Decrypter.decrypt(userInput);
			System.out.printf("Your encrypted value is %04d" , decryptedNum);
		}

	}
	
}