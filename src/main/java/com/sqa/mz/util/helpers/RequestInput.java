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

	public static boolean getBoolean(String question) {
		// Local variable to hold input
		String input;
		// Infinit loop to look out for Yes and No valid options
		while (true) {
			// Ask the user a question to get relative input
			System.out.print(question + " (Yes/Y) or (No/N):");
			// Set the input based on what the user enters on their keyboard
			input = scanner.nextLine();
			// Check if the user has entered Yes
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
				// Return that the user has selected Yes so return true
				return true;
				// Check if the user has entered No
			} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
				// Return that the user has selected No so return false
				return false;
				// Or else the user has not entered a valid option
			} else {
				// Return an error message to user
				System.out.println("You have not entered a valid option, please choose Yes/Y or No/N.");
				// Continue infinite loop to ask for a valid response
				continue;
			}
		}
	}

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

	public static int getInt(String question) {
		// Local variable to hold temporary number
		int num;
		//
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Integer.parseInt(scanner.nextLine());
				// Break out of the infinite loop
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return num;
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

	/**
	 * @param string
	 * @param string2
	 * @param i
	 * @param j
	 * @param k
	 * @param l
	 * @param m
	 * @return
	 */
	public static int getInt(String question, String unacceptableErrorMessage, int min, int max) {
		String input = null;
		int resultValue;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);

				if (resultValue >= min && resultValue <= max) {
					validInt = true;
				}

				if (!validInt) {
					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

			} catch (NumberFormatException e) {
				System.out.println("You have not provided a valid integer type (" + input + ")");
			} catch (InvalidAcceptableNumberException e) {
				String message = String.format(unacceptableErrorMessage, min, max);
				System.out.println(message);
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

	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		scanner = new Scanner(System.in);
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
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

	public static String getString(String question, String cancellationMessage, Enum... acceptableEnum) {
		String input = null;
		String resultValue;
		String resultString = "";
		boolean validWord = false;
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				resultValue = input;

				for (int i = 0; i < acceptableEnum.length; i++) {
					if (resultValue.trim().equalsIgnoreCase(acceptableEnum[i].toString())) {
						validWord = true;
						resultString += acceptableEnum[i].toString();
					}
				}
				if (!validWord) {
					throw new InvalidAcceptableWordException();
				}
				return resultString;
			} catch (InvalidAcceptableWordException e) {
				System.out.println("You have not provided an acceptable word (" + input + ")");
				System.out.print("You must provide one of the following options: ");
				for (int i = 0; i < acceptableEnum.length; i++) {
					System.out.print(acceptableEnum[i].toString());
					if (i != acceptableEnum.length - 1) {
						System.out.print(", ");
					}
				}
				System.out.println();

				String message = String.format(cancellationMessage, input);
				System.out.println(message);
				// Or can be done in one line
				// System.out.println(String.format(cancellationMessage,
				// input));

				System.out.println("If you would like to cancel, enter '*' or just press enter to continue:");
				input = scanner.nextLine();
				if (input.equalsIgnoreCase("*")) {
					return resultString;
				}

			}
		}
	}
}
