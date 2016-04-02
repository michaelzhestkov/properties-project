/**
 *   File Name: AppBasics.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.mz.util.helpers;

import java.util.*;

public class AppBasics {

	public static void fairwellUser(String userName, String appName) {

		System.out.println("Thank you " + userName + " for using " + appName + " Application");
		userName = RequestInput.getString("Have a great day!");

	}

	public static String welcomeUser(String appName) {
		String userName;

		System.out.println("Welcome to the " + appName + " Application");
		userName = RequestInput.getString("Could I get your name, please?");
		return userName;

	}

	Scanner scanner = new Scanner(System.in);
}
