package cmd;

import static java.lang.System.currentTimeMillis;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cmd 
{
	public static void main(String[] args) 
	{
		double a = currentTimeMillis();
		
		
//		int i =0;
//		while(i <= 1000000000)
//		{
//			i++;
////			System.out.println(".");
//		}
		


//		c c1 = new c(1,2,3);
//		
//		c1.print();
		
//		int year = 1997;
//		int month = 7;
//		int day = 3;
//		
//		
//
//		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//		Calendar cal = Calendar.getInstance();
//		// month is -1 cause it is zero based numbering for months
//		cal.set(year, month - 1,day);
//		
//		String formatedDOB = format.format(cal.getTime());
//		System.out.println(formatedDOB);
////		String dob = day +"/" + month +"/" +year;
	

		double b = currentTimeMillis();
		System.out.println(b - a);
	}
	
}
