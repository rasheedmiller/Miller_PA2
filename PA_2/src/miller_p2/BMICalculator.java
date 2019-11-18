package miller_p2;

import java.util.Scanner;
public class BMICalculator {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

		 double weightFactor = 0.0;
		 double heightFactor = 0.0;

		 System.out.print("Enter 1 to use metric units or 2 to use imperial units: ");
		 int unitChoice = in.nextInt();

		 if (unitChoice == 1) {
		 System.out.print("Enter your weight in kilograms: ");
		 weightFactor = in.nextDouble();

		 System.out.print("Enter your height in meters:");
		 heightFactor = in.nextDouble();
		 } else if (unitChoice == 2) {
		 System.out.print("Enter your weight in pounds: ");
		 weightFactor = 703 * in.nextDouble();

		 System.out.print("Enter your height in inches:");
		 heightFactor = in.nextDouble();
		 } else {
		 System.out.println("Invalid entry. Terminating program.");
		 System.exit(0);
		 }

		 heightFactor = Math.pow(heightFactor, 2.0);
		 double bmi = weightFactor / heightFactor;

		 System.out.println("Your BMI is " + bmi);
		 System.out.print("You are ");

		 if(bmi < 18.5) {
		 System.out.println("underweight.");
		 } else if (bmi < 25) {
		 System.out.println("normal weight.");
		 } else if (bmi < 30) {
		 System.out.println("overweight.");
		 } else {
		 System.out.println("obese.");
		 }
		 }

		 }
