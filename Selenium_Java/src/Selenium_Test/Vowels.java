package Selenium_Test;

public class Vowels {
	
	public static void main(String[] args) {
		
		String input="Mohanasundaram";
		String vowel="aeiou";
		
		for(int i=0;i<input.length();i++) {
			
			char ch=input.charAt(i);
			
			if (vowel.indexOf(ch) !=-1)
			{
				System.out.print(ch);
			}
			
		}
		
		
	}

}
