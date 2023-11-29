package composition;

/**
 *
 * @author Abdsaleh
 */
import java.util.ArrayList;
import java.util.Scanner;


class Date
{
	int year;
	int month;
	int day;
	Date()
	{
		
	}
	Date(int year, int month , int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
class student
{
	String name;
	int id;
	Date registerDate;
	
	student(String name,int id, Date reg)
	{
		this.name = name;
		this.id = id;
		registerDate = reg;
	}
	
	void print()
	{
		System.out.println(name + " / "+ id);
		System.out.println(registerDate.year + " / " + registerDate.month + " / " + registerDate.day);
	}
	
}
public class Composition 
{
	public static void main(String[] args) 
	{
//		Date d = new Date();
//		d.day = 8;
//		d.month = 1;
//		d.year = 2023;
//		student std = new student("Ali",101,d);
		
		ArrayList<student> stdArr = new ArrayList<>();
	
//	stdArr.add(std);		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your name , id , year , month , day");
		
		String name = sc.nextLine();
		int id = sc.nextInt();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		Date d2 = new Date(year,month,day);
		
		
		student std1 = new student(name , id ,d2);
		
		stdArr.add(std1);
		for (int i = 0; i < stdArr.size(); i++)
		{
		stdArr.get(i).print();
		}	
	}
	
}
