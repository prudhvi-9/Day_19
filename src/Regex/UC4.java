package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {

	/**
	 * This method is created to check if PhoneNumber is valid or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter PhoneNumber:");
		String str1 = cs.next();
		isPhoneNumber(str1);

		if (isPhoneNumber(str1)) {
			System.out.println("PhoneNumber " + str1 + " is valid.");
		} else {
			System.out.println("PhoneNumber " + str1 + " is not valid.");

		}
		cs.close();
	}

	public static boolean isPhoneNumber(String string) {
		/*
		 * Regex to check valid PhoneNumber.
		 */
		String regex = "91\\s[0-9]{10}";

		/*
		 * To compile the ReGex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If thePhoneNumber is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given PhoneNumber and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the PhoneNumber matched the Regex.
		 */

		return m.matches();
	}

}
