/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class RedHeadDuck extends Duck{
	
	public RedHeadDuck()
	{
		super.setFlyBehaviour(new FlyWithWIngs());
		super.setQuackBehaviour(new Quack());

	}
	@Override
	public void display()
	{
		System.out.println("looks like a redhead Duck");
	}
	
}
