/**
 *   File Name: RequestInput.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.mz.util.helpers;

import java.util.*;

public class RequestInput {

	private static Scanner scanner;

	// Get a char value from the user
	public static char getChar(String question) {
		String input;
		char resultValue;
		scanner = new Scanner(System.in);
		System.out.print(question);
		input = scanner.nextLine();
		resultValue = input.charAt(0);
		// scanner.close();

		return resultValue;

	}

	// Get a char value from the user, must be an acceptable value
	public static char getChar(String question, char... acceptableNumber) {
		String input;
		char resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		System.out.print(question);
		input = scanner.nextLine();
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input.charAt(0);

				for (int x = 0; x < acceptableNumber.length; x++) {
					if (resultValue == acceptableNumber[x]) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid number (" + input + ")");
			}
		}
		// resultValue = input.charAt(0);
		// resultValue = Char.parseChar(input);
		// scanner.close();
		//
		// return resultValue;

	}

	// Get a double value from the user
	public static double getDouble(String question, double... acceptableNumber) {
		String input = null;
		Double resultValue;
		boolean validDouble = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Double.parseDouble(input);

				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validDouble = true;
					}
				}
				if (!validDouble) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid number (" + input + ")");
			}
		}

	}

	// Get a int from the user, must be in acceptable range value
	public static int getInt(String question, int... acceptableNumber) {
		String input = null;
		int resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);

				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid number (" + input + ")");
			}
		}
	}

	// Get a int from the user, must be in acceptable range value
	public static int getIntWithRange(String question, int intMin, int intMax) {
		String input = null;
		int resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);

				for (int i = 0; i < intMax; i++) {
					if (resultValue >= intMin && resultValue <= intMax) {
						validInt = true;
					}
				}
				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not provided an acceptable valid number (" + input + ")");
			}
		}

	}

	// Get a random number from a certain range
	public static int getRandomNumber(String question) {
		scanner = new Scanner(System.in);
		int firstRangeNumber = 0;
		int lastRangeNumber = 0;
		String input, input2;
		System.out.println(question);
		System.out.println("Random number will be generated between this number (please, type in) ");
		input2 = scanner.nextLine();
		System.out.println("and this number ");
		input = scanner.nextLine();
		firstRangeNumber = Integer.parseInt(input);
		lastRangeNumber = Integer.parseInt(input2);
		int randomNumber = (int) (Math.random() * firstRangeNumber) + lastRangeNumber;
		int resultValue = randomNumber;
		return resultValue;

	}

	// Get a String from the user, must be an acceptable value
	public static String getString(String question, String... acceptableWords) {
		String input = null;
		String resultValue;
		boolean validWord = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input;
				for (int i = 0; i < acceptableWords.length; i++) {
					if (resultValue.trim().replace(" ", "").equalsIgnoreCase(acceptableWords[i])) {
						validWord = true;
					}

				}
				if (!validWord) {
					throw new InvalidAcceptableWordException();
				}
				return resultValue;
			} catch (InvalidAcceptableWordException e) {
				System.out.println("you have not provided valid word " + input);
			}
		}
}
