package practice;
/*
 * @author Abdsaleh
 */
public class PersonTester
{
	public static void main(String []args)
	{
		Person1 p1 = new Person1("Ahmad",20,new Dob(12,7,2020));
		
		System.out.println(p1.getName());
		
		System.out.println(p1.getdate().getYear());
		
		System.out.println(p1.getAge());
		
		p1.getdate().setYear(2023);
		
		System.out.println(p1);
		
	}
}
