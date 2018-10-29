package main;

import java.util.Scanner;

/**
 * This function runs the Calculate class Enter two numbers and select operation
 * two run the program
 * @author Abdullah Al Noman
 * @since 29.10.2018
 */

public class Calculator {
	// Create objects of Scanner class and Calculate class
	static Scanner input = new Scanner(System.in);
	static Calculate calc = new Calculate();

	/**
	 * main method to run the program
	 * @param args Unused
	 */
	public static void main(String args[]) {
		// Enter first number
		System.out.print("Enter number 1:");
		int num1 = input.nextInt();

		// Enter second number
		System.out.print("Enter number 2:");
		int num2 = input.nextInt();

		// Select operation
		System.out.println("Select operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int opt = input.nextInt();

		double res = 0.0;
		switch (opt) {
		case 1:
			res = calc.add(num1, num2);
			break;
		case 2:
			res = calc.subtract(num1, num2);
			break;
		case 3:
			res = calc.multiplicate(num1, num2);
			break;
		case 4:
			res = calc.divide(num1, num2);
			break;
		}

		// Print result
		System.out.println("Result : " + res);
	}
}