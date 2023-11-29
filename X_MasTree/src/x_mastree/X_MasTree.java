package x_mastree;

import java.util.Scanner;

/**
 *
 * @author Abdsaleh
 */
public class X_MasTree {
	public static void main(String[] args) {
		
		X_Mas();
		//XTree();
	}
	
	public static void X_Mas()
	{
		for (int z = 0 ; z < 3 ; z ++)
		{
			for (int i = 6 ; i > 0 ; i--)
			{
				for(int j = i ; j < 6 ; j++)
				{
					System.out.print(" *");
				}
			System.out.println(" *");				
		}
		}
	}
	
	
	private static void XTree()
	{
	/*
		I took this code from : https://www.geeksforgeeks.org/printing-triangle-pattern-in-java/	
	*/
		
	System.out.println("Enter rows :");
	Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
  
        // loop to iterate for the given number of rows
	for (int z = 0 ; z < 3 ; z ++)
	{
		for (int i = 1; i <= rows; i++) 
	{
  
            // loop to print the number of spaces before the star
		   for (int j = rows; j >= i; j--)
		{
			System.out.print(" ");
		}
  
		// loop to print the number of stars in each row
		for (int j = 1; j <= i; j++) 
		{
			System.out.print("* ");
		}
  
		// for new line after printing each row
		System.out.print("\n");
	}
	}
}
	
}
