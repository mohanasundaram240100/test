package Selenium_Test;

public class Overloading {

	int i = 10;
	String s = "Mohan";
	void print(String s) {
        System.out.println(s);
    }

    void print(int i) {
        System.out.println(i);
    }

    void print(String s, int i) {
        System.out.println(s + " " + i);
    }
	
	public static void main(String[] args) {
		
		
	}
	

}
