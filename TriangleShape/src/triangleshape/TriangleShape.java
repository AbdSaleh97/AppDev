package triangleshape;

import java.util.Scanner;

/*
 * @author Abdsaleh
 */
public class TriangleShape 
{

	public static void main(String[] args) 
	{
		Triangle();
		//Tr2();
	}
	
	
	public static void Triangle()
	{
		//int i = 10 ;
		System.out.println("Enter size :");
		Scanner a = new Scanner(System.in);
		int i = a.nextInt();
		int s = i ;
		
		while (i > 0)
		{
			int j = i ;
			while(j < s )
			{
				System.out.print(" *");
				j++;
			}
			System.out.println(" *");
			i--;
		}
	}
	
	
	
	private static void Tr2()
	{
	/*
		I took this code from : https://www.geeksforgeeks.org/printing-triangle-pattern-in-java/	
	*/
		
	System.out.println("Enter the number of rows to be printed:");
	Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
  
        // loop to iterate for the given number of rows
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
