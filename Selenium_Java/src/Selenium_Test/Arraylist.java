package Selenium_Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList();
		
	ArrayList<Integer> a=new ArrayList();
		
		a.add(125);
		a.add(23);
		a.add(12);
		
		for(int i=0;i<a.length();i++) {
			System.out.println(a(i));
			
		}
		
	ArrayList<Integer> b=new ArrayList<Integer>(Arrays.asList(12,45,78,89));
	
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a);
	}
	
		
	System.out.println(a);	

	String[] arr = {"hkjd","ddjkf","dfs"};
	List<String> Newarray = Arrays.asList(arr);
	Newarray.contains(0);
	
	System.out.println(Newarray);
	
	for(int i=0;i<Newarray.size();i++) {
	
		System.out.println(Newarray);
		
	}
	
	
	
	
	
	}

}



