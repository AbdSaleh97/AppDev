package mathapplications;

import java.util.*;
/*
 * @author Abdsaleh
 */
public class MathApplications 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the first element:");
		Scanner sc = new Scanner (System.in);
		
		int fst = sc.nextInt();
		
		System.out.print("Enter CD:");
		
		int CD = sc.nextInt();
		System.out.print("Size:");
		int size = sc.nextInt();
		int[] array = new int[size];
		int i = 0 ;
		
		while(i < size )
		{
			array[i] = fst ;
			fst += CD ;	
			System.out.println(array[i]);
			i++;
		}
		System.out.println("find A(n)??");
		System.out.println("Prees Y to Exit.");
		System.out.println("Press any key to continue" );
	
		String ch = sc.next();
		
		if (ch.equals("Y")||ch.equals("y"))
		{
			 System.exit(0);
		}
		else
		{
			System.out.print("Enter element:");
			int element = sc.nextInt();
			int value = array[0] + CD * (element - 1 );
			
			System.out.println("The " + element + "th elelment's value is: " + value);	
		}
	}
}
