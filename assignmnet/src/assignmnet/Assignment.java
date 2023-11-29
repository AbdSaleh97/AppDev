package assignmnet;

import java.util.Scanner;

public class Assignment
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter three numbers: ");
		

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int result = (x + y) * z;

		System.out.println(result);	
	}
	
}
