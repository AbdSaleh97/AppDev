package hourglassshape;

import java.util.Scanner;

/*
 * @author Abdsaleh
 */
public class HourGlassShape {
	public static void main(String[] args) 
	{
		HourGlass();
		//HGlass();
	}
	public static void HourGlass()
	{
		for (int i = 0 ; i < 6 ; i++)
			{
			for(int j = i ; j < 5 ; j++)
				{
				System.out.print(" *");
				}
			System.out.println(" *");				
		}
		for (int i = 5 ; i > 0 ; i--)
			{
			for(int j = i ; j < 6 ; j++)
			{
				System.out.print(" *");
			}
			System.out.println(" *");				
		}
	}
	public static void HGlass()
	{		
	/*
	The same previous code in The Triangle method but i added to it a little .
	*/
		
	for (int i = 6; i >= 1; i--) 
	{
            // loop to print the number of spaces before the star
            for (int j = 6; j >= i; j--)
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
	 for (int i = 1; i <= 6; i++) 
	{
            // loop to print the number of spaces before the star
            for (int j = 6; j >= i; j--)
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

