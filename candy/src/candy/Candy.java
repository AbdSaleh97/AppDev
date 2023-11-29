package candy;

import java.util.Scanner;
import java.util.Arrays;
/*
 * @author Abdsaleh
 */
public class Candy 
{
	public static void main(String[] args)
	{	
//		int min = 4 ;
//		int max = 10000;
//		
////		int N =(int)(Math.random()*(max-min+1)+ min);
//		System.out.println((N));
		
		System.out.print("Enter number of bags :");
		Scanner scanner = new Scanner (System.in);
		int bags = scanner.nextInt();
		
		if(bags >= 4 && bags < 10000)
		{
		int [] arr1 = new int[bags];
		System.out.println("Enter number of sweets in each bag :");
		
		for (int i = 0; i < bags; i++)
		{
			int numOfSweet = scanner.nextInt();
			arr1[i] = numOfSweet ;
		}
		System.out.println("********************");
//		for (int j = 0; j < arr1.length; j++)
//		{
//			System.out.println( " * " + arr1[j]); 		
//		}
//		System.out.println("********************");
		
		int [] hand1 = new int [2];
		int [] hand2 = new int [2]; 
		int temp ;
		int sum = 0;
		
		
//		System.out.println(getLargest(arr1,arr1.length)+ "\n*********************\n");
		int max = 0, index = 0;	
		for (int i = 0; i < hand1.length ; i++) 
		{			
			 for (int h = 0; h < arr1.length; h++)
			{
			  if (arr1[h] > max) 
			  {
				max = arr1[h];
				index = h ;
			  }					
			}
			max = 0;
//			temp =  getLargest(arr1,arr1.length);
			temp = arr1[index];
			
//			hand1[i] = temp;
//			System.out.println(hand1[i] + "\n");

			hand1 [i] = (int)(Math.random()*(temp+1));
			arr1[index] = 0;
//			System.out.println("h1 0&1=" + hand1[i]+ "\n");	
		}
		//*************************************************
		for(int j = 0; j < hand2.length;j++)
		{			
			 for (int h = 0; h < arr1.length; h++)
			{
			  if (arr1[h] > max) 
			  {
				max = arr1[h];
				index = h ;	
			  }					
			}
			max = 0 ;
			
//			temp =  getLargest(arr1,arr1.length);

			temp = arr1[index] ;
			
//			hand2[j] = temp;
//			System.out.println(hand2[j] + "\n");

			hand2 [j] = (int)(Math.random()*(temp+1));
			arr1[index] = 0;
//			System.out.println( "h2 0&1=" + hand2[j] + "\n");			
		}
			for(int a = 0 ; a < hand1.length;a++)
			{
			sum += hand1[a] + hand2[a];
			}
			System.out.println("sum = " + sum);
	}		
		else
		{
			System.out.println("Invalid value.");
			System.exit(0);
		}
}	
}



