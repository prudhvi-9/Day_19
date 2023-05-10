package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {

	/**
	 * This method is created to check if email is valid or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter email:");
		String str1 = cs.next();
		isemail(str1);

		if (isemail(str1)) {
			System.out.println("email " + str1 + " is valid.");
		} else {
			System.out.println("email " + str1 + " is not valid.");

		}
		cs.close();
	}

	public static boolean isemail(String string) {
		/*
		 * Regex to check valid email.
		 */
		String regex = "abc[.][x]?[y]?[z]?@bl[.]co[.][i]?[n]?";

		/*
		 * To compile the ReGex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the email is empty. return false
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given email and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the email matched the ReGex.
		 */

		return m.matches();
	}

}
