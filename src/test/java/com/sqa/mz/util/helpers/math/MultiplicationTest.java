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

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.mz.util.helpers.*;

@RunWith(Parameterized.class)
public class MultiplicationTest {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 2.0 }, 4.0 }, { new double[] { 5.0, 2.0, 2.0, 3.0 }, 60.0 } };
		return data;
	}

	private double expectedResult;

	private double[] numbers;

	public MultiplicationTest(double[] numbers, double expectedResult) {
		super();
		this.expectedResult = expectedResult;
		this.numbers = numbers;

	}

	@Test
	public void testMultiplication() {
		double actualResult;
		actualResult = MyMath.multNumbers(this.numbers);
		String numberString = Arrays.toString(this.numbers);
		String errorMessage = String.format("Error: The result of multiplying %s is actually %.0f, not expected",
				numberString, actualResult);
		String message = String.format("The result of multiplying %s is actually %.0f", numberString, actualResult);
		// System.out.println(message);
		Assert.assertEquals(errorMessage, this.expectedResult, actualResult, 0);
	}

}
