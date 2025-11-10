package Selenium_Test;

public class reverse {
	
	public static void main(String[] args) {
		
		
		String input="Mohanasundaram";
		String reverse="";
		
		for (int i=input.length()-1;i>=0;i--) {
			
			reverse +=input.charAt(i);
			
			System.out.println(reverse);
		}
		
	}

}
