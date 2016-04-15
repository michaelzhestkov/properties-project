package com.sqa.mz.util.helpers;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

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
public class DivisionTest {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { 4.0, 2.0, 2.0 }, { 6.0, 2.0, 3.0 }, { 12.0, 4.0, 3.0 }, { 100.0, 50.0, 2.0 } };
		return data;
	}

	private double expectedResult;

	private double num1;
	private double num2;

	public DivisionTest(double num1, double num2, double expectedResult) {
		super();
		this.expectedResult = expectedResult;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Test
	public void testDivideNumbers() {
		double actualResult;
		double num1 = this.num1;
		double num2 = this.num2;
		double expectedResult = this.expectedResult;
		actualResult = MyMath.divideNumbers(num1, num2);
		String message = String.format("The result of %.0f devided by %.0f is %.0f", num1, num2, actualResult);
		System.out.println(message);
		Assert.assertEquals(message, this.expectedResult, actualResult, 0);
	}

}
