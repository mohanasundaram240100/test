package Selenium_Test;

import java.sql.Driver;

public class Reversestring {
	
	public static void main(String[] args) {
		
		String input1 = "Mohanasundaram";
		String reversed1 = new StringBuilder(input1).reverse().toString();
		
		System.out.println(reversed1);
	
		
		String input2 ="Mohan";
		String reversed2 = new StringBuffer(input2).reverse().toString();
		System.out.println(reversed2);
		
		String input3="ABCDEFGH";
		String reversed3=new StringBuilder(input3).reverse().toString();
		System.out.println(reversed3);
		
		
		
	}

}
