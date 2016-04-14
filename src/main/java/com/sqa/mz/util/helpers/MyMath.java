/**
 *   File Name: MyMath.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.mz.util.helpers;

public class MyMath {
	// A static method which divides one number by another 1/2

	public static double divideNumbers(double num1, double num2) {
		double result;
		result = num1 / num2;
		return result;
	}

	// A static method which let the user know if there is a clean division with
	// no remainder
	public static boolean hasCleanDivision(double num1, double num2) {
		double result;
		result = num1 % num2;
		if (result == 0) {
			System.out.println("Clean division");
			return true;

		} else {
			System.out.println("Not Clean division");
			return false;

		}
	}

	// A static method which multiplies a set of numbers
	public static double multNumbers(double... nums) {
		double result = 1;
		Double[] numbers = new Double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result *= nums[i];
		}
		return result;
	}

	// A static method which multiplies a given number by the amount
	public static double powerNumber(double number, double power) {
		// Create a variable to hold to final result and setting it to power of
		// 1
		double result;
		if (power > 1) {
			result = 1;
			for (int i = 0; i < power; i++) {
				result *= number;
			}
		} else if (power == 1) {
			result = number;
		} else {
			System.out.println("Power is 0 or below, returning 0");
			result = 0;
		}
		return result;
	}

	private double result;

	// Default Constructor
	public MyMath() {
		setResult(0);
	}

	// Argument Constructor, starting value given
	public MyMath(double defaultNum) {
		setResult(defaultNum);
	}

	/*
	 * A class which gets the total of an instance object of type MyMath Class
	 */

	// To Add a number to total
	public double add(double num) {
		setResult(getResult() + num);
		return getTotal();
	}

	// To divide a number of total
	public double div(double num) {
		setResult(getResult() / num);
		return getTotal();
	}

	/**
	 * @return the result
	 */
	public double getResult() {
		return this.result;
	}

	// To get the current total
	public double getTotal() {
		return this.result;
	}

	// To multiply a number to total
	public double mult(double num) {
		setResult(getResult() * num);
		return getTotal();
	}

	// To reset total to 0
	public void reset() {
		setResult(0);

	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

	// To subtract a number from total
	public double sub(double num) {
		setResult(getResult() - num);
		return getTotal();
	}
}