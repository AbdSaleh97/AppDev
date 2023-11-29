package btecassignment_mod;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * @author Abdsaleh
 */
public class BtecAssignment_Mod 
{
	public static void main(String[] args)
	{
		A();
		System.out.println("\n**************************\n");
		test();//the most effecient way
	}
	
	
	
	
	
	public static void A()
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter message :");
		int message = in.nextInt();
		System.out.print("Enter Public key :");
		int publicKey = in.nextInt();
		System.out.print("Enter Mod value :");
		int mod = in.nextInt();
		
		if(publicKey >= mod || message > mod)
		{
			System.out.println("Public key and message should be samaller than mod.");
			System.exit(0);
		}
		int temp = 0;
		int roundIndex = 0;
		int privateKey;
		
		do 
		{
		temp = message + (mod * roundIndex);	
		roundIndex++;			
		}while(temp % (message * publicKey) != 0);
		
		privateKey = temp / (message * publicKey);	
		System.out.println("private key = " + privateKey + "  \n-->divisible value by " + message * publicKey +" (message * public key) = " + temp);
		  
		System.out.println("the original message:" + temp % mod);
	}
	
	
	
	
	
	
	
	public static void test()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter message :");
		int message = in.nextInt();
		System.out.print("Enter Public key :");
		int publicKey = in.nextInt();
		System.out.print("Enter Mod value :");
		int mod = in.nextInt();
		
		if(publicKey >= mod || message > mod)
		{
			System.out.println("Public key and message should be samaller than mod.");
			System.exit(0);
		}
		int temp ;
		int roundIndex = 0;
		int privateKey;
		
		do 
		{
		temp = (mod * roundIndex)+ 1;	
		roundIndex++;			
		}while(temp % publicKey != 0);
		
		privateKey = temp / publicKey;	
		System.out.println("private key = " + privateKey + "  \n-->divisible value by " + publicKey +" (public key) = " + temp); 
		System.out.println("the original message:" + message % mod);
	}

	

	public static void bIntegers()
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter message :");
		BigInteger message = in.nextBigInteger();
		System.out.print("Enter Public key :");
		BigInteger publicKey = in.nextBigInteger();
		System.out.print("Enter Mod value :");
		BigInteger mod = in.nextBigInteger();
		
		if(publicKey.equals(mod) || message.equals(mod))
		{
			System.out.println("Public key and message should be samaller than mod.");
			System.exit(0);
		}
//		if(publicKey. || message.compareTo(mod)= s)
//		{
//			System.out.println("Public key and message should be samaller than mod.");
//			System.exit(0);
//		}
		BigInteger temp ;
		BigInteger roundIndex = BigInteger.valueOf(0);
		BigInteger privateKey;
		
		do 
		{
		temp = message.add(mod.multiply(roundIndex));	
		roundIndex = roundIndex.add(BigInteger.ONE);	
		}while(temp.mod(message.multiply(publicKey)).compareTo(BigInteger.ZERO)!= 0);
		
		privateKey = temp.divide(message.multiply(publicKey));	
		System.out.println("private key = " + privateKey + "  \nthe first divisible value by " + message.multiply(publicKey) + " = "  + temp);
		  
		System.out.println("the original message " + temp.mod(mod));
	}
}
//*/
