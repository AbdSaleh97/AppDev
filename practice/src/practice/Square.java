package practice;
/*
 * @author Abdsaleh
 */
public class Square {
	
	private static Square instance = null;
	private int length;
	
	public static Square getInstance()
	{
		if (instance == null) {
			instance = new Square();
		}
		return instance;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	private Square()
	{
		length = 10;
	}
	
	public int area(int length)
	{
		int area = length * length;
		return area;
	}

	@Override
	public String toString() {
		return "Square{" + "length=" + length + '}';
	}
	
	
}
