
package assignmnet;

import java.util.Scanner;
public class assginment6
{
	public static void main(String[] args)
	{	
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature in Celsius: ");
		
		float t = sc.nextInt();
		float f = t * 1.8f + 32;
		
		System.out.println("temperature in fahrenheit is " + f);
	}
	
}
