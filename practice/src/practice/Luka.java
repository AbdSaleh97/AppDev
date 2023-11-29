/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class Luka extends Fighter{
	
	Luka()
	{
		super.setKick(new NormalKick());
		super.setPunch(new NormalPunch());
	}
	public void charName()
	{
		System.out.println("Luka");
	}
	
	
}
