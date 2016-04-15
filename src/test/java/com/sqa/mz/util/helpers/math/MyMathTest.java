/**
 *   File Name: MyMathTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.mz.util.helpers.math;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.mz.util.helpers.*;

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
@RunWith(Parameterized.class)
public class MyMathTest {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 1.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 4.0 } };
		return data;
	}

	private double expectedResult;

	private double num;

	private double power;

	public MyMathTest(double num, double power, double expectedResult) {
		super();
		this.expectedResult = expectedResult;
		this.num = num;
		this.power = power;
	}

	@Test
	@Ignore
	public void testDivideNumbers() {
		double result;
		double num1 = 10;
		double num2 = 2;
		result = MyMath.divideNumbers(num1, num2);
		System.out.println(String.format("The result of %.0f deleted by %.0f is %.0f", num1, num2, result));
	}

	@Test
	@Ignore
	public void testHasCleanDivision() {
		boolean result;
		double num1 = 10;
		double num2 = 2;
		result = MyMath.hasCleanDivision(num1, num2);
		System.out.println("The result is " + result);
	}

	@Test
	@Ignore
	public void testMultNumber() {

		double nums = 0;
		double result = MyMath.multNumbers(10, 10);
		System.out.println(String.format("The result of multiplication multiple numbers is %.0f", result));
	}

	@Test
	@Ignore
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
		double actualResult;
		double expectedResult = this.expectedResult;
		double num = this.num;
		double power = this.power;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("The result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		Assert.assertEquals(message, expectedResult, actualResult, 0);
	}

	@Test
	@Ignore
	public void testReset() {
		// double resetNumber = 100;
		double result;
		MyMath myMathReset = new MyMath();
		myMathReset.reset();
		System.out.println("Number is reset to 0");
	}
}
