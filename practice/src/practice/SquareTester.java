package practice;
/*
 * @author Abdsaleh
 */
public class SquareTester {
	public static void main(String []args)
	{
		System.out.println(Square.getInstance());
		Square s = Square.getInstance();
		s.setLength(5);
		System.out.println(s.area(s.getLength()));
		System.out.println(s.getLength());
	}
	
}
