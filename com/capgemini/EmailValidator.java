package com.capgemini;



import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {	
	public static void main(String[] args) {
		System.out.println("Welcome to Email Validator");
		Pattern p= Pattern.compile("(^[a-zA-Z0-9]+)");
		Matcher m=p.matcher("krishna");
		boolean b=m.matches();
		if(b) {
			System.out.println("Matches");
		}
		else {
			System.out.println("Doesn't Match");
		}
	}
}