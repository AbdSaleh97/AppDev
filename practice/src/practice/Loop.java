
package practice;


import java.util.Scanner;

public class Loop {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int min = 0;
		int max = 0;
		int temp = 0;

		while (count < 20){
			
			System.out.println("Enter numbers:");
	
			if (temp == 0) {
				temp = sc.nextInt();
				min = temp;
				max = temp;
			}
			else
			{
				temp = sc.nextInt();
				
				if (temp < min) {
					min = temp;
				}
				
				if (temp > max)
				{
					max = temp;
				}
			}
			count++;	
		} 
		System.out.println("Max num is: " + max + " \nMin num Is: " + min);
		
		
		
		
		
		
	
		for (int i = 0; i < 15; i++) {
			
			System.out.println("Enter number: ");
			int j = sc.nextInt();
			boolean isPrime = true;
			
			
			for (int k = 2; k <= Math.sqrt(j); k++) {
				if (j % k == 0){
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) 
			{
				System.out.println(j + " is a prime number.");
			}
		}
		
		
		
		
		
		
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			System.out.println("Enter numbers: ");
			int a = sc.nextInt();
			sum += a;
			i++;
		}
		int avg = sum / 5;
		System.out.println("average= "+avg);





		System.out.println("Enter number: ");
		int b = sc.nextInt();
		int digitCount = (int)Math.log10(b) + 1;

		for (i = 0; i < digitCount; i++) {
		while(b > 0)
		{
			int c = b % 10;
			b = b /10;
			System.out.print(c + " ");
		}
		}


		
		
	}
}
