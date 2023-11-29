package palindrome;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String palindorme = sc.next();	
		boolean isPalindorme = false;
		
		if (palindorme.charAt(0) == palindorme.charAt(palindorme.length()-1) &&
		palindorme.charAt(0) % 2 == 0)
		{
			for (int i = 0; i < palindorme.length()-3; i++)
			{
				if (palindorme.charAt(i + 1) == palindorme.charAt(i + 2) )
				{
					isPalindorme = true;
				}
				else
				{
					isPalindorme = false;
					break;
				}
			}	
		}
		if (isPalindorme == true )
			System.out.println(palindorme + " is an even palindorme.");
		else
			System.out.println(palindorme + " is not an even palindorme.");		
	}
	
}
