package programmingcontest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammingContest
{
	public static void main(String[] args) 
	{	
//		currencyManager();
		newNumberingSystem();
		//passWord();
	}
	
	
	public static void passWord()
	{
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		boolean alphabetDigit = false;
		boolean capitalAlphabetDigit = false;
		boolean numericDigit = false;
		
		if (pass.length() >= 8 && pass.length() <= 12)
		{
			if (!(pass.charAt(0) >= '0' && pass.charAt(0) <= '9'))
			{
				for (int i = 0; i < pass.length(); i++) 
				{
					if (pass.charAt(i) == '/' || pass.charAt(i) == ' ') 
					{
						break;
					}
					if ( (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'))
					{
						alphabetDigit = true;
					}
					if ((pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) 
					{
						capitalAlphabetDigit = true;
					}
					if ((pass.charAt(i) >= '0' && pass.charAt(i) <= '9')) 
					{
						numericDigit = true;
					}
				}
			}
		}
		if (alphabetDigit && capitalAlphabetDigit && numericDigit)
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
	}
		
	public static void currencyManager()
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> currency = new ArrayList<>();
//		ArrayList<Integer> primeFactors = new ArrayList<>();
		
		int currencyCount = sc.nextInt();
		
		for (int i = 0; i < currencyCount; i++) 
		{
			currency.add(sc.nextInt());
		}
		if (currency.size() >= 3 )
		{
		int targetVal = sc.nextInt();
		int count = 0;

		for (int i = 0; i < currency.size(); i++)
		{				
			for (int j = 0; j < primeFactor(currency.get(i)).size(); j++)
			{
				if (targetVal % primeFactor(currency.get(i)).get(j) == 0)
				{
				for (int k = 0; k < currency.size(); k++)
				{
					if(currency.get(k).equals(primeFactor(currency.get(i)).get(j)))
					{
					count++;
					}
				}
				}
			}
			for (int j = 0; j < currency.size(); j++) 
			{
				if (targetVal % currency.get(i) == currency.get(j))
				{
					count++;
				}
			}
		}
		System.out.print("Coins: ");
		for (int i = 0; i < currencyCount; i++)
		{
			System.out.print(currency.get(i) + " ");
		}
		System.out.println("\nTotal: " + targetVal);
		System.out.println("Total combination: " + count);	
		}
		else 
		{
			System.out.println("Invalid value.");
		}		
		
	}
	public static List<Integer> primeFactor(int number)
	{
		int n = number;
		List<Integer> factors = new ArrayList<>();
		for (int i = 2; i <= n; i++) 
		{
		    while (n % i == 0)
		    {
			factors.add(i);
			n /= i;
		    }
		}
		return factors;
	}
	
	
	public static void newNumberingSystem()
	{
		Scanner sc = new Scanner(System.in);
		String originalVal;
		int count = 0;
		ArrayList<Integer> val = new ArrayList<>();
		do
		{
			originalVal = sc.next();
			int sum = 0;
			if (originalVal.length() >= 1 && originalVal.length() <=10 ) 
			{
				int a = 0;
				int index = originalVal.length();
				for (int i = 0; i < originalVal.length() ; i++) 
				{
					switch(originalVal.charAt(i))
					{
						case '%' -> a = 0;
						case ')' -> a = 1;
						case '~' -> a = 2;
						case '@' -> a = 3;
						case '?' -> a = 4;
						case '\\' -> a = 5; 
						case '$' -> a = -1;
					}
					index--;
					sum += a * Math.pow(6,index);
				}
				val.add(sum);
				sum = 0;
			}
			System.out.println(val.get(count));
			count++;
		}while(!(originalVal.equals("#")));	
					
	}

	
	
	public static void carRace()
	{

		Scanner sc = new Scanner(System.in);
		
		int speed = sc.nextInt();
		int sum = 0;
		int tempVal = speed;
		if (speed >= 150 && speed <= 500) 
		{
			while(tempVal > 0)
			{
				sum += tempVal % 10;
				tempVal /= 10;
			}
		}
		if (speed % sum == 0)
		{
			System.out.println("Winner");
		}
		else
		{
			System.out.println("Not Winner");
		}
}
}
