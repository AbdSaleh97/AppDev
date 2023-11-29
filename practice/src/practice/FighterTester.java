/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class FighterTester {
	public static void main(String []args)
	{
		Fighter f1 = new Alvara();
		f1.jumb();
		f1.performKick();
		f1.performPunch();
		
		f1.setKick(new HuricaneKick());
		f1.performKick();
		f1.setPunch(new UppercutPunch());
		f1.performPunch();
		
		
		Fighter f2 = new Luka();
		
		f2.jumb();
		f2.roll();
		f2.performPunch();
	}
	
	
	
	
}
