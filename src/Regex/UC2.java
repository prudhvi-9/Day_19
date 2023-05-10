package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {

	/**
	 * This method is created to check if LastName is valid or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter LastName:");
		String str1 = cs.next();
		isValidLastName(str1);

		if (isValidLastName(str1)) {
			System.out.println("LastName " + str1 + " is valid.");
		} else {
			System.out.println("LastName " + str1 + " is not valid.");

		}
		cs.close();
	}

	public static boolean isValidLastName(String string) {
		/*
		 * Regex to check valid LastName.
		 */
		String regex = "^[A-Z]\\w{3,20}$";

		/*
		 * To compile the ReGex.
		 */
		Pattern pattern = Pattern.compile(regex);

		/*
		 * If the LastName is empty, return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given LastName and regular expression.
		 */

		Matcher match = pattern.matcher(string);

		/*
		 * Return if the LastName matched the ReGex.
		 */

		return match.matches();
	}

}
