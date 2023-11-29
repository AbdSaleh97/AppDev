package age;
import java.util.Calendar;

/*
 * @author Abdsaleh
 */
public class calculateAge 
{
	public static int time (int birthday)
	{		
		Calendar cal = Calendar.getInstance();
		int your_Age = cal.get(Calendar.YEAR) - birthday;
		
		return your_Age;
	}
}
