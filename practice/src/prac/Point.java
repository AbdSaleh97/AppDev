package prac;

import java.util.HashMap;
import java.util.Map;
/*
 * @author Abdsaleh
 */
	public class Point{
	
	private int x;
	private int y;
	
	private static Map<String,Point> m = new HashMap<>();
	
	private Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static Point getInstance(int x, int y)
	{
		String key = x+","+y;
		if (m.containsKey(key))
		{
			return m.get(key);
		}
		else
		{
			Point p1 = new Point(x,y);
			m.put(key, p1);
			return p1;
		}
	}
	
	
	
}
