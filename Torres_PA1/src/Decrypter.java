
public class Decrypter {
	
	public static int decrypt(int userInput){
		
		/*take Input number
		 * create thousands number, hundreds, tens, ones
		 * Input/1000 = thousands, Input/1000 = hundreds...
		 * Add 3, mod 10.
		 * swap thousands and tens
		 * swap hundreds and ones
		 * multiply numbers by respective amount
		 * add and assign to Input number
		 * Print
		 */
		
		int thousands, hundreds, tens, ones;
		thousands = ((userInput / 1000) + 3)%10;
		hundreds = ((userInput / 100) + 3)%10;
		tens = ((userInput / 10) + 3)%10;
		ones = (userInput + 3)%10;

		int temp = thousands;
		thousands = (tens*1000);
		if(thousands == 0) {
			thousands = 1000;
		}
		tens = (temp*10);
		if(tens == 0) {
			tens = 10;
		}
		
		temp = hundreds;
		hundreds = (ones*100);
		if(hundreds == 0) {
			hundreds = 100;
		}
		ones = temp;
		
		int decryptedNum = thousands+hundreds+tens+ones;
		return decryptedNum;
	}
	
}
