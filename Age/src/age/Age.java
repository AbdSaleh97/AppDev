package age;
import java.util.Scanner;

/*
 * @author Abdsaleh
 */
public class Age
{
	public static void main(String[] args)
	{
		calculateAge c = new calculateAge();
		System.out.println("Enter your Birthday :");
		Scanner input = new Scanner (System.in);
		int birthday = input.nextInt(); 
		int result = c.time(birthday);
		System.out.println("Your age is : " + result);
		
		
		
	}
	
}
