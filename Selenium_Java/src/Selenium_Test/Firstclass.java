package Selenium_Test;

//Main Class
public class Firstclass {
	
	//Method (methods are not alloweded inside main function) i.e. allowed only main class.
	public String getData() {
		
		System.out.println("First Statement");
		return ("First");
		
	}
	
	//Main function
	public static void main(String[] args) {
		
		
		Firstclass fr=new Firstclass();
		fr.getData();
		System.out.println("Second Statement");	
		
		
	}

}
