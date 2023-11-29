package codeforces;

import java.util.*;
import java.util.Scanner;

public class CodeForces 
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		magnet();
//		usefulMath();
		footBallMatch();
	}
	
	public static void footBallMatch()
	{
		int n = sc.nextInt();//total score
		int m = sc.nextInt();// team score
		
		int result ;
		if ( 0 <= m && m <= n && n <= 1000)
		{
			result = n - m;
			System.out.println(result);
		}
	}
	
	public static void usefulMath()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] result = new char[s.length()];
		
		if (s.length() <= 100)
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if (s.charAt(i) != '+')
				{
					result[i] = s.charAt(i);
				}
			}
			
			Arrays.sort(result);
		}
		
		
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] );	
	}
	
	public static void magnet()
	{
		Scanner in = new Scanner (System.in);
		int counter = 0 , b = 0 , a;
		int n = in.nextInt();
		
		
		
		for (int i = 0; i < n; i++)
		{
			a = in.nextInt();
			if (a != b)
			{
				counter++;
				b = a;
			}
			
		}
		System.out.println(counter);
		
	}
	
	public static void lovelyPalindromes()
	{
		Scanner in = new Scanner(System.in);
		StringBuilder x = new StringBuilder(in.next());
		System.out.println(x.toString() + x.reverse().toString());
	}
	
	public static void lovelyPalindromes1()
	{
		Scanner in = new Scanner(System.in);
		char[] x = in.next().toCharArray();
		String y = "";
		for (int i = x.length - 1; i >= 0; i--)
		{
			y+= x[i];
		}
		String a = new String(x);
		System.out.println(a + y);	
	}
	
	
	public static void vowlChkr()
	{
		Scanner in = new Scanner(System.in);
		String str =in.next();
		String nStr = "";
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if( ch == 'A'||ch =='E'||ch =='O'||ch =='I'||ch =='Y'||ch =='U'||ch =='a'||ch =='u'||ch =='e'||ch =='o'||ch =='i'||ch =='y' )
				continue;
			else
			{
				nStr+= ".";
				nStr+=Character.toLowerCase(ch);
			}
		}
		System.out.println(nStr);
	}
}

