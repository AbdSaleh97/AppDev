package javaapplication22;

import java.util.Scanner;


public class JavaApplication22 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
//		int i = 4;
//		
//		while(i <= 32)
//		{
//			if(i % 2 == 0)
//				System.out.println(i);
//			i++;	
//		}
	
		
//		int b = 2;
//		int sum = 0;
//		
//		while(b <= 49)
//		{
//			if(b % 2 != 0)
//				sum += b;
//			b++;
//		}
//		System.out.println(sum);
		

//		int factor = 1;
//		
//		System.out.print("Factorial of: ");
//		
//		int index = sc.nextInt();
//		int factorial = 1;		
//		while(factor <= index)
//		{
//			factorial *= factor;
//			factor++;	
//		}
//		System.out.println(factor -1 +"!"+ " = " +factorial);



		
		int i ;
		char a;
		int sum = 0;
		int counter = 0 ;
		
		do
		{
			counter++;
			System.out.println("Enter mark: ");
			i = sc.nextInt();
			if( i >= 50)
				System.out.println("You passed");
			else
				System.out.println("You failed");
			sum += i;
			System.out.print("Do you want to enter a another mark? ");
			a = sc.next().charAt(0);
		}while(a == 'y');
		System.out.println("\nThe average is = "+ (double)sum / counter);
		
		
		
		
		
		
		
		
		
//		double b = 0;
//		
//		for (double i = 0; i < 11; i++) 
//		{
//			b += (3 * (i * i)) - (10 *(Math.sin(Math.toRadians(i)))) + 50 ;
//		}
//			System.out.println(b);
//		}
	}
}
