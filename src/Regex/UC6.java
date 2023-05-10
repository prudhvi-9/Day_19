package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC6 {

	/**
	 * This method is created to check that Password should have at least 1 upper
	 * case.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter Password:");
		String str1 = cs.next();
		isPassword(str1);

		if (isPassword(str1)) {
			System.out.println("Password " + str1 + " is valid.");
		} else {
			System.out.println("Password " + str1 + " is not valid.");

		}
		cs.close();
	}

	public static boolean isPassword(String string) {
		/*
		 * Regex to check valid Password .
		 */
		String regex = "[[A-Z]+[a-z]]{8,}";

		/*
		 * To compile the ReGex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the Password is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given Password and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the Password matched the ReGex.
		 */

		return m.matches();

	}

}
