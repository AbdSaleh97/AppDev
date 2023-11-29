/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class CarTester 
{
	public static void main(String []args)
	{
//		Engine eng = new Engine(2000,150,"M24);
		
		Car1 c1 = new Car1("Ford",1995,new Engine(2000,150,"M24"));
		
		System.out.println(c1.getCarType());
		
		System.out.println(c1.getYear());
		
		System.out.println(c1.getCarEngine());
		
		System.out.println(c1);
		
		System.out.println(c1.getCarEngine().getEngineName());
		
		System.out.println(c1.getCarEngine().getBhp());
		
		
	}
	
}
