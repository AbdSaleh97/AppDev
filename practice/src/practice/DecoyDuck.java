/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class DecoyDuck extends Duck{
	public DecoyDuck()
	{
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new MuteQuack());

	
	}
	@Override	
	public void display()
	{
		System.out.println("looks like a decoy duck");
	}
	
}
