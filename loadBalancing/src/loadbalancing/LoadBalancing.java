package loadbalancing;

import java.util.Scanner;
/*
 * @author Abdsaleh
 */
public class LoadBalancing 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many users?");
		int n = sc.nextInt();
		System.out.print("How many servers?");
		int s = sc.nextInt();
		
		int hash = 37 ;//any value as a starting point 
		int index ;
		
		for (int i = 0; i < n; i++)
		{
			index = hash % s;
			String formatted = String.format("%04d", hash);
			System.out.println("request "+i +" with hash code " + formatted + " to server " + index);
			hash++;// mimicking Round Robin algorithm by generating a sequentiall hash value 
		}
	}
}
