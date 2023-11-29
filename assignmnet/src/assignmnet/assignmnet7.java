package assignmnet;

import java.util.Scanner;
public class assignmnet7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp ;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("original value " + num2 + "\nafter swaping " + num1);
		System.out.println("original value " + num1 + "\nafter swaping " + num2);
	}
}
