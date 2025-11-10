package Selenium_Test;

public class multiarray {
	
	public static void main(String[] args) {
		
		int a[][]= {{11,24,30},{18,37,33},{21,22,46}};
		int max=a[0][0];
		
		for(int i=0;i<a.length;i++) 
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			
			System.out.println("Max Num" + " " +max);
		}
		
	}


}
