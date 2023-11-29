package practice;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class ParkTester 
{
	
	public static void main(String []args)
	{
		ArrayList<Tree> plant = new ArrayList<>();
	
		plant.add(pk(7,"Apple","dark red"));
		plant.add(pk(5,"Banana","Yellow"));
		plant.add(pk(9,"Lemon","Yellow"));


		Park prk = new Park("amman",20202,10000,plant);	
		
		
		System.out.println(prk);
		
		System.out.println(prk.getPlant().get(0).getTreeType());
		
		System.out.println(prk.getPlant().get(1).getTreeAge());
		
		System.out.println(prk.getArea());
		
		prk.setArea(270.34);
		System.out.println(prk.getArea());
		
		
		prk.getPlant().get(0).setColor("Green");
		System.out.println(prk.getPlant().get(0).getColor());
		
		System.out.println(prk.getPlant());
	}
	
	public static Tree pk(int treeAge,String treeType, String treeColor)
	{
		Tree p = new Tree(treeAge, treeType, treeColor);
		
		return p;
	}
	
	
	
}
