package com.capgemini;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailValidator {	
	public static void main(String[] args) {
		System.out.println("Welcome to Email Validator");

		Pattern p= Pattern.compile("^[\\u0E00-\\u0E7Fa-zA-Z0-9-]+([.+-_][\\u0E00-\\u0E7Fa-zA-Z]+)?@[\\u0E00-\\u0E7Fa-zA-Z0-9-]+\\.[\\u0E00-\\u0E7Fa-z]{2,}(\\.[\\u0E00-\\u0E7Fa-z]{2,})?$");
		Matcher m=p.matcher("abc_xyz@yahoo.com.in");
		String[] thDomains = new String[4];
		thDomains[0] = "email-test@universal-acceptance-test.international";
		thDomains[1] = "email-test@universal-acceptance-test.icu";
		thDomains[2] = "อีเมลทดสอบ@ยูเอทดสอบ.ไทย";
		thDomains[3] = "อีเมลทดสอบ@ทีเอชนิค.องค์กร.ไทย";

		for(String domain : thDomains){
			//Check Thai Domain Name
			Matcher match= p.matcher(domain);
			boolean b=match.matches();
			if(b) {
				System.out.println("Matches");
			}
			else {
				System.out.println("Doesn't Match");
			}
		}
		boolean b=m.matches();
		if(b) {
			System.out.println("Matches");
		}
		else {
			System.out.println("Doesn't Match");
		}
	}
}