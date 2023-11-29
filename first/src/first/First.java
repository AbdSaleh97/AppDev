package first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;



public class First {
	
//	public static void clockFun()
//	{
//		LocalDateTime now = LocalDateTime.now();
//		String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//		System.out.println(time);
//		
//	}	
	public static void main (String [] args)
	{	
//		Timer timer = new Timer();
//		timer.schedule(new clockFun(), 0, 1000);
		System.out.println(pow());
		

	}
	
	
	private static class clockFun extends TimerTask
	{
		public void run()
		{
			LocalDateTime now = LocalDateTime.now();
			String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
			System.out.println(time);
		}
	}
	public static void flipHeads(int n)
	{
		int headCounter = 0 ;
		int whileCounter = 0;
		while(headCounter != n)
		{
			double randomNumber = Math.random() ;
			if (randomNumber < 0.5d)
			{
				System.out.println("tails");
				headCounter =0;
			}
			else 
			{
				System.out.println("heads");
				headCounter ++;
			}
					whileCounter ++;
		}
	
		System.out.println("it took " + whileCounter + " flips to get " + n +" heads in a row .");
	}
	private static void even()
	{
		System.out.println("Enter range :");
		Scanner rng = new Scanner (System.in);
		int r = rng .nextInt();	
		for ( int i = 0; i <= r ; i ++ )
		{
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
	private static String sc()
	{
		System.out.println("Enter an integer :");
		Scanner nn = new Scanner (System.in);
		int n = nn.nextInt();
		int h = n * n ;
		int g = n * n *n ;
		return (n + " squared = " + h +  "\n" + n + " cubed = " + g );	
	}
	private static String leap()
	{
		System.out.println("Enter year :");
		Scanner yy = new Scanner (System.in);
		int y = yy.nextInt();
		if (y % 4 == 0)
			return (y + " is a leap year.");
		else
			return (y + " is not a leap year.");
	}
	private static String SI()
	{
		System.out.println("Enter principal :");
		Scanner pp = new Scanner (System.in);
		double p = pp.nextInt();
		
		System.out.println("Enter time period :");
		Scanner nn = new Scanner (System.in);
		double n = nn.nextInt();
		
		System.out.println("Enter interest rate :");
		Scanner rr = new Scanner (System.in);
		double r = rr.nextInt();
		double SI = p * n * r ;
		return (SI + " is the simple interest rate. ");	
	}
	
	private static double rad()
	{
		System.out.println("Enter radius :");
		Scanner rr = new Scanner (System.in);
		int r = rr.nextInt();
		double R = r * r * 3.14 ;
		return R;
	}
	private static int pow()
	{
		System.out.println("Enter an Integer :");
		Scanner ii = new Scanner (System.in);
		int i = ii .nextInt();
		int t = i ;
		System.out.println("Enter the power :");
		Scanner pp = new Scanner (System.in);
		int p = pp .nextInt();
		for (int j = 1 ; j < p ; j++)
		{
			i *= t ;
		}
		return i ;
	}
	private static String area()
	{
		System.out.println("Enter Length and Width:");
		Scanner len = new Scanner (System.in);
//		System.out.println("Enter Width :");
		Scanner wid = new Scanner (System.in);
		int L = len.nextInt();
		int W = wid.nextInt();
		int area = L * W ;
		return ("The area of the rectangle is :" + area) ;	
	}
	
	private static String lgt()
	{
		System.out.println("Enter three values");
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b )
		{
			if(a > c)
				return ( a +" is largeest") ;
		}
		if (b > c )
			return ( b + " is largest");
		else
		{
			return (c + " is largest");
		}
		
		
	}
	
	private static String posOrNeg(int x)
	{
		if(x > 0)
			return ( x + " is positive");
		else 
			return (x + " is negative");
		
	}
	
	private static int mul(int y , int x)
	{
		int h = y * x ;
		return h;
	}
	
	
}
