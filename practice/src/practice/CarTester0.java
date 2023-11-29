package practice;
/*
 * @author Abdsaleh
 */
public class CarTester0 
{
	public static void main(String []args)
	{
		Car0 c = new Car0("mini van", 2002, "yellow");
		
		System.out.println(c);
		
		
		Bmw b = new Bmw("520",2006,"black",true);
		
		System.out.println(b);
		b.park();
		b.drive();
		
		System.out.println(b.isFast());
		
		Mercedes m = new Mercedes("G class",2018,"Gray",true);
		
		m.drive();
		m.park();
		System.out.println(m.toString());
		
		System.out.println(m.getYear());
		
		
		Tesla t = new Tesla("model y", 2020,"White",true);
		
		t.drive();
		t.park();
		System.out.println(t);
		System.out.println(t.isAutoDrive());
	}
	
	
}
