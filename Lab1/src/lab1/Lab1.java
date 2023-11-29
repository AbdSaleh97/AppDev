package lab1;

import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args)
	{
//		qOne();
//		qTwo();
//		qThree();
		qFour();
//		qFive();
//		qSix();
	}
	
	public static void qOne()
	{
		System.out.println("Welcome");
		System.out.println("The name is Abdelrahman Hisham Asa'd Saleh ");
		System.out.print("Birthdate 1997/07/03");
		System.out.println(" age 24");
		System.out.println("Thank you");
	}
	
	
	public static void qTwo()
	{
		int studentId = 22030961;
		String section = "Section 101";
		char btecDgree = 'P';
		float degree = 93.77f;
		
		System.out.println(studentId);
		System.out.println(section);
		System.out.println(btecDgree);
		System.out.println(degree);
	}
	
	
	public static void qThree()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a , b ,c :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float result = 0.5f * ((b*b)*a) + c*b + c;
		
		System.out.println(result);
	}
	
	
	public static void qFour()
	{
		int radius = 5;
		//float pi = 3.141f;
		float volume = 4/3f * 3.141f * radius * radius * radius ;
//		double volume = 4/3f * pi * Math.pow(radius,3);
		
		System.out.println(volume);
	}
	
	
	public static void qFive()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 6 grades :");
		int grd1 = sc.nextInt();
		int grd2 = sc.nextInt();
		int grd3 = sc.nextInt();
		int grd4 = sc.nextInt();
		int grd5 = sc.nextInt();
		int grd6 = sc.nextInt();
		
		int sum = grd1 + grd2 + grd3 + grd4 + grd5+ grd6;
		int avg = sum / 6 ;
		
		System.out.println("The summation for all grades is " + sum );
		System.out.println("The average is " + avg);
		
		
	}
	
	
	
	public static void qSix()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many boxes are you buying ");
		int boxNum = sc.nextInt();
		System.out.print("What's their price ");
		float boxPrice = sc.nextFloat();
		System.out.print("The ammount of cash given to cashier ");
		float cashAmount = sc.nextFloat();
		
		float total = boxNum * boxPrice ;
		float rest = cashAmount - total ;
		
		System.out.println("Total = " + total );
		System.out.println("Rest = " + rest);
	}
	
}
