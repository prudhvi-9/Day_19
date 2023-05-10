package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {

	/**
	 * This method is created to check if first name is valid or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter FirstName:");
		String str1 = cs.next();
		isValidFirstName(str1);

		if (isValidFirstName(str1)) {
			System.out.println("FirstName " + str1 + " is valid.");
		} else {
			System.out.println("FirstName " + str1 + " is not valid.");

		}
		cs.close();
	}

	public static boolean isValidFirstName(String string) {
		/*
		 * Creating Regex to check valid FirstName.
		 */
		String regex = "^[A-Z]\\w{3,20}$";

		/*
		 * To Compile the Regex.
		 */
		Pattern pattern = Pattern.compile(regex);

		/*
		 * If the FirstName is empty,return false
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given FirstName and regular expression.
		 */

		Matcher match = pattern.matcher(string);

		/*
		 * Return if the FirstName matched the ReGex.
		 */

		return match.matches();
	}

}
