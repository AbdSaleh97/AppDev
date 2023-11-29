package javaapplication12;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * @author Abdsaleh
 */
public class JavaApplication12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.print('*');
			if (i == 0 || i % 2 == 0 )
			{
				for (int j = 0; j < 5; j++)
				{
					System.out.print('*');
				}
			}
			System.out.println("");
		}
		
		
		
//		System.out.println("Enter your fees: ");
//		int fee = sc.nextInt();
//		
//		System.out.println("Enter your GPA: ");
//		float gpa = sc.nextFloat();
//		
//		float dis ;
//		
//		if (gpa >= 90) 
//		{
//			dis = fee * 0.25f ;
//			System.out.println("Your fees after discout are "+ (fee - dis));
//			
//		}
//		else if(gpa >= 75)
//		{
//			dis = fee * 0.2f;
//			System.out.println("Your fees after discout are "+ (fee - dis));
//		}
//		else if(gpa >= 60)
//		{
//			dis = fee * 0.1f;
//			System.out.println("Your fees after discout are "+ (fee - dis));
//		}
//		else
//		{
//			System.out.println("There is no discount.");
//			System.out.println("Your fees are "+ fee);
//		}
		
		
		
//		System.out.print("Enter Row: ");
//		int row = sc.nextInt();
//		for (int i = 1; i <= row; i++)
//		{
//			for (int j = 1; j <= i; j++)
//			{
//				System.out.print(j + " ");
//			}
//			System.out.println();	
//		}


		
		
//		long startTime = System.currentTimeMillis();    //Store starting time

//		int a = 373;
//		int b = 2;
//		
//		for (int i = 0; i < Math.pow(a,.5); i++)
//		{
//			if (a % b == 0) 
//			{
//				System.out.println(b);
//				break;
//			}
//			b++;
//		}
		
		
		
//		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add("abd");
//		list.add("elrahman");
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.next();
		
//		int x = 0;
//		for (int i = 0; i < 100; i++)
//		{
//			list.add(x);
////			System.out.println(x);
//			x++;
//		}
////		
//		list.forEach((s) -> System.out.println(s));
////
//		for(int s : list)
//		{
////			list.add(name);
//			System.out.println(s);
//		}
		
		//System.out.println(list.indexOf("elrahman"));
//		System.out.println((list.contains("abd"))? "YES" : "NO");
//		System.out.println(list.indexOf("abd"));
//		list.remove(0);
//		System.out.println(list.contains("abd")? "YES" : "NO");
//		
//		Integer n = 45678293;
//		System.out.println(n.hashCode());
//		System.out.println(n.hashCode(n));
//		System.out.println("Time taken : " + ( System.currentTimeMillis() - startTime ) + " millisecond(s)." );
	}	
}
