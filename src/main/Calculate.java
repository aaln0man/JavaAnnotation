package main;

/**
 * This class is for functions of adding, subtracting,
 * multiplying and dividing two numbers 
 * @author Abdullah Al Noman
 */

public class Calculate {
	/**
	 * This function adds two numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * This function subtracts two numbers
	 * Second number num2 is subtracted from the first number num1
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * This function multiplies two numbers num1 & num2
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiplicate(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * This function divides two numbers
	 * First number num1 is divided by the second number num2
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double divide(int num1, int num2) {
		return (double)num1 / num2;
	}
}