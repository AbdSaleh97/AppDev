package series;

import java.util.Scanner;


public class Series 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int intialValue = 1  ;
		System.out.print("Index: ");
		int index = sc.nextInt();
		int counter = 4 ; // the first value that we multiplied by 
		int result ;
		int factorial = counter + index -2 ;
		
		for(int i = factorial -1  ; i > 1 ; i--)
		{			
			factorial *= i ;
		}
		result = factorial / 6;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}
	
}
