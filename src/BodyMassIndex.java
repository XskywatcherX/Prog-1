import java.util.Scanner; // Needed for the Scanner class

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		// Declare constant values
		final double POUNDS_PER_KILOGRAM = 2.2;
		final double INCHES_PER_METER = 39.37;
		final double INCHES_PER_FOOT = 12;

		// Declare variables
		double feet;
		double inches;
		double weightInPounds;
		double heightInInches;
		double heightInMeters;
		double weightInKilograms;
		double bodyMassIndex;

		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's height
		System.out.print("Enter your height (feet and inches): ");
		feet = keyboard.nextDouble();
		inches = keyboard.nextDouble();
		
		// Get the user's weight (in pounds)
		System.out.print("Enter your weight (pounds): ");
		weightInPounds = keyboard.nextDouble();
		
		// Calculate the user's total height
		heightInInches = (feet * INCHES_PER_FOOT) + inches;
		heightInMeters = heightInInches / INCHES_PER_METER;
		
		// Calculate the user's weight in kilograms
		weightInKilograms = weightInPounds / POUNDS_PER_KILOGRAM;
		// Calculate the Body Mass Index
		bodyMassIndex = weightInKilograms / Math.pow(heightInMeters, 2);
		
		// Display height in inches and meters
		System.out.println();
		System.out.printf("\tHeight in inches:    %7.2f\n", heightInInches);
		System.out.printf("\tHeight in meters:    %7.2f\n", heightInMeters);
		
		// Display weight in kilograms
		System.out.printf("\tWeight in kilograms: %7.2f\n", weightInKilograms);
		
		// Display their calculated Body Mass Index
		System.out.printf("\tBody Mass Index:     %7.2f\n", bodyMassIndex);
	}
}