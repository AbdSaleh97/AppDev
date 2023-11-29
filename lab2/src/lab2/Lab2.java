package lab2;

import java.util.Scanner;
import java.time.Month;


public class Lab2 
{
	public static void main(String[] args) 
	{
		
		Q1();
//		Q2();
//		Q3();
//		Q4();
//		Q5();
//		Q6();
//		Q7();
		
	}
	
	public static void Q1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2)
		{
			System.out.println(num1 +" and " +num2 + " are equal");
		}
		else 
		{
			System.out.println(num1 + " and " + num2 + " are not equal");
		}
	}
	
	public static void Q2()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int test = sc.nextInt();
		
		System.out.println((test % 2 == 0)? test +" is an even number" : test + " is an odd number");
	}
	
	
	public static void Q3()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature: ");
		float temp =sc.nextFloat();
				
		if(temp <= 0)
		{
			System.out.println("Freezing weather");
		}
		else if(temp > 0 && temp <= 10)
		{
			System.out.println("Very cold weather");
		}
		else if(temp > 10 && temp <= 20)
		{
			System.out.println("Cold weather");
		}
		else if(temp > 20 && temp <= 30)
		{
			System.out.println("Normal temperature");
		}
		else if (temp > 30 && temp <= 40)
		{
			
			System.out.println("Hot temperature");
		}
		else
		{
			System.out.println("Very hot temperature");
		}
	}
	
	
	
	public static void Q4()
	{
		Scanner sc = new Scanner(System.in);;
		
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
			
		if(ch >= '0' && ch <= '9')
		{
			System.out.println(ch + " is a digit");
		}
		else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			System.out.println(ch + " is a an alphabet");
		}
		else 
		{
			System.out.println(ch + " is a special character");
		}
		
	}
	
	
	
	public static void Q5()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a' : 
			case 'e' :
			case 'i' :
			case 'u' : 
			case 'o' : 
			case 'A' : 
			case 'E' : 
			case 'U' : 
			case 'I' : 
			case 'O' : System.out.println("The alphapet is a vowel");
				   break;
			default : System.out.println("The alphapet is not a vowel");
		}
	}
	
	
	public static void Q6()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month name or number: ");
		
		if(sc.hasNextInt())
		{
			int i = sc.nextInt();
			Month monthNum = Month.of(i);

			System.out.println(monthNum.length(false));
		}
		else // if(sc.hasNext())
		{
		String month = sc.next();
		Month monthName = Month.valueOf(month.toUpperCase());
		
		System.out.println(monthName.length(false));
		}
	}
	
	
	public static void Q7()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println("Enter operand: ");
		
		char sym = sc.next().charAt(0);
	
		switch(sym)
		{
			case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
			case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
			case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
			case '/' -> System.out.println(a + " / " + b + " = " + (a / b));
			case '%' -> System.out.println(a + " % " + b + " = " + (a % b));
			
			default  -> System.out.println("Bad operand");
		}
	}
}
