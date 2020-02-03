import java.util.Scanner;

public class BMICalculator {

	/*
	 * BMI = ((703 * weightInPounds)/(heightInInches*heightInInches))
	 * BMI = (weightInKilo/(heightInMeters*heightInMeters))
	 * 
	 * Gives User choice between height and weight
	 * Choose between 1 or 2
	 * if 1, then ask for weight and height in pounds / inches
	 * if 2, ask for weight and height in kilos / meters
	 * Create formulas for each user choice.
	 * print out BMI.
	 */
	static int userChoice;
	static double WeightInPounds;
	static double WeightInKilos;
	static double heightInMeters;
	static double heightInInches;
	static double BMI;
	
	public static void readUserData() {
		
		Scanner scnr = new Scanner(System.in);
		userChoice = 0;
		while(userChoice < 1 || userChoice > 2) {
			System.out.println("Press 1 to enter weight in pounds or 2 to enter weight in kilos");
			userChoice = scnr.nextInt();
			if(userChoice < 1 || userChoice > 2) {
				System.out.println("Please enter a valid choice");
			}
		}
		if(userChoice==1) {
			System.out.println("Please enter weight in pounds");
			WeightInPounds = scnr.nextInt();
			System.out.println("Please enter height in total inches");
			heightInInches = scnr.nextInt();
		}
		if(userChoice==2) {
			System.out.println("Please enter weight in kilos");
			WeightInKilos = scnr.nextInt();
			System.out.println("Please enter height in meters");
			heightInMeters = scnr.nextInt();
		}

		
	}
	
	public static void calculateBmi() {
		
		if(userChoice==1) {
			BMI = ((703 * WeightInPounds)/(heightInInches*heightInInches));
			
		}
		if(userChoice==2) {
			BMI = (WeightInKilos/(heightInInches*heightInInches));
		}
		
	}
	
	public static void displayBmi() {
		
		System.out.println("Your BMI is " + BMI);
		
	}
	
	public static void main(String[] args) {
		
	    readUserData();
	    calculateBmi();
	    displayBmi();
	
	}
}
