/**
 *   File Name: MyMathTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.mz.util.helpers;

import org.junit.*;

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Zhestkov, Michael
 * @version 1.0.0
 * @since 1.0
 *
 */
public class MyMathTest {

	@Test
	public void testDivideNumbers() {
		double result;
		double num1 = 10;
		double num2 = 2;
		result = MyMath.divideNumbers(num1, num2);
		System.out.println(String.format("The result of %.0f deleted by %.0f is %.0f", num1, num2, result));
	}

	@Test
	public void testHasCleanDivision() {
		boolean result;
		double num1 = 10;
		double num2 = 2;
		result = MyMath.hasCleanDivision(num1, num2);
		System.out.println("The result is " + result);
	}

	@Test
	public void testMultNumber() {

		double nums = 0;
		double result = MyMath.multNumbers(2, 2, 2, 2);
		System.out.println(String.format("The result of multiplication multiple numbers is %.0f", result));
	}

	@Test
	public void testMyMathClass() {
		double result;
		double addNumber = 10;
		double subNumber = 3;
		double divNumber = 5;
		double multNumber = 5;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.sub(subNumber);
		myMath.div(divNumber);
		myMath.mult(multNumber);
		result = myMath.getTotal();
		System.out.println(String.format("0 plus %.0f minus %.0f multiply by %.0f and devided by %.0f is %.0f",
				addNumber, subNumber, multNumber, divNumber, result));

	}

	@Test
	public void testPowerNumbers() {
		double result;
		double num = 5;
		double power = 4;
		result = MyMath.powerNumber(num, power);
		System.out.println(String.format("The result of %.0f to the " + "power of %.0f is %.0f", num, power, result));

	}

	@Test
	public void testReset() {
		// double resetNumber = 100;
		double result;
		MyMath myMathReset = new MyMath();
		myMathReset.reset();
		System.out.println("Number is reset to 0");
	}
}
