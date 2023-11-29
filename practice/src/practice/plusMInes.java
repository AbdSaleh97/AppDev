package practice;

import java.util.Scanner;

/*
 * @author Abdsaleh
 */

public class plusMInes 
{
	public static void main(String []args)
	{
		int []arr ={1,2,3,0,0,-1,-2,-3};
		
		res(arr);
		
	}
	
	public static void res(int []arr )
	{
		int len = arr.length;
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for (int i = 0; i < len; i++)
		{
			if (arr[i] > 0)
			{
				pos++;
			}
			else if (arr[i] < 0)
			{
				neg++;
			}
			else 
			{
				zero++;
			}
		}
		double posRatio = (double)pos/len;
		double negRatio = (double)neg/len;
		double zeroRatio = (double)zero/len;
		
		System.out.printf("%.6f%n%.6f%n%.6f%n",posRatio, negRatio ,zeroRatio);		
	}
}
