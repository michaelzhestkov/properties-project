/**
 *   File Name: Display.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.util.helpers;

public class Display {

	public static int[][] display2DArray(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[ " + matrix[i][j] + " ]");
			}
			System.out.println();
		}
		System.out.println();
		return matrix;
	}

	// Method should display 2 dimensional array nicely formatted on screen
	public static void display2DArray1(int[][] matrix) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			stringBuilder.append("----------");
		}
		System.out.println(stringBuilder);
		for (int i = 0; i < matrix.length; i++) {
			displayArray(matrix[i]);
		}
		System.out.println(stringBuilder);
	}

	public static int[] displayArray(int[] array) {
		int x;
		for (x = 0; x < array.length; x++) {
			System.out.print("[ " + array[x] + " ]");
		}
		System.out.println();
		return array;

	}

	// Method should display array nicely formatted on screen
	public static void displayArray1(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("|\t");
		for (int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]);
			if (i < array.length - 1) {
				stringBuilder.append("\t");
			}
		}
		stringBuilder.append("\t|\n");
		System.out.print(stringBuilder);
	}

}
