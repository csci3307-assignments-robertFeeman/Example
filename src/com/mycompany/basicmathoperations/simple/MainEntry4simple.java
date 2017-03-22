/**
 * 
 */
package com.mycompany.basicmathoperations.simple;

import java.util.Scanner;

/**
 * @author ilker
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4simple with args:" + args);
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		float result;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		
		// Multiply block
		Multiply multiplier = new Multiply();
		result = multiplier.multiply(number1, number2);
		System.out.printf("result for multiply() is %.2f%n", result);
		
		//Divide block
		Divide divide = new Divide();
		result = divide.divide(number1, number2);
		System.out.printf("result for divide() is %.2f%n", result);
		
		//Add block
		Addition add = new Addition();
		result = add.addition(number1, number2);
		System.out.printf("result for addition() is %.2f%n", result);
		
		//Divide block
		Subtract subtract = new Subtract();
		result = subtract.subtract(number1, number2);
		//System.out.printf("result for subtract() is %.2f%n", result);
				
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("\nresult for subtract() is %.2f%n", result);
		scanner.close();
	}

}
