package algorithm;

import java.util.Scanner;

public class Algorithm 
{
	public static void main(String[] args) 
	{
		 Algorithms();
	}
	
	public static void Algorithms()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("First Element :");
		int firstElement = sc.nextInt();
		System.out.print("Step value :");
		int step = sc.nextInt();
		System.out.print("Number to check :");
		int n = sc.nextInt();

//		int n = (int) (Math.random()* ( 1000 - firstElement ) + firstElement) ;

		if ((n - firstElement) % step == 0)
		{
			System.out.println(n);
			System.out.println("true");
			System.out.println("index = " + ((n - firstElement) / step));
		}
		else
		{
			System.out.println("\n" + n);
			System.out.println("false");				
		}	
	}
}
