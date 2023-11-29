package divideonthree;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;

public class DivideOnThree 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		BigInteger n = sc.nextBigInteger();
		
		ArrayList<BigInteger> B = new ArrayList<>();
		B.add(n);
		B.add(BigInteger.valueOf(3));
		
		if(n.toString().length()>= 255 || n.signum() == -1 || n.signum() == 0)
		{
			System.out.println("Invalid Value.");
			System.exit(0);
		}
		else
		{
			if(n.mod(B.get(1)).equals(BigInteger.ZERO))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}
	
}
