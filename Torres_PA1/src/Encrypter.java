public class Encrypter {
	

	
	public static int encrypt(int userInput){
		
		/*take Input number
		 * create thousands number, hundreds, tens, ones
		 * Input/1000 = thousands, Input/1000 = hundreds...
		 * Add 7, mod 10.
		 * swap thousands and tens
		 * swap hundreds and ones
		 * multiple numbers by respective amount
		 * add and assign to Input number
		 * Print
		 */
		
		int thousands, hundreds, tens, ones;
		thousands = ((userInput / 1000) + 7)%10;
		hundreds = ((userInput / 100) + 7)%10;
		tens = ((userInput / 10) + 7)%10;
		ones = (userInput + 7)%10;

		//swap first and 3rd digits
		int temp = thousands;
		thousands = (tens*1000);
		tens = (temp*10);

		//swap 2nd and 4th digits
		temp = hundreds;
		hundreds = (ones*100);
		ones = temp;
		
		//create encrypted number
		int encryptedNum = thousands+hundreds+tens+ones;
		
		return encryptedNum;
		}
	
	

	
}
