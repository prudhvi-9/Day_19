package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC9 {

	/**
	 * This method is created to clear all email samples provided separately.
	 * 
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
		 * Regex to check valid email .
		 */
		String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}[,.a-z]+)+";

		/*
		 * To compile the Regex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the email is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given email and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the email matched the Regex.
		 */

		return m.matches();
	}

}
