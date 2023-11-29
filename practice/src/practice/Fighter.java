/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Abdsaleh
 */
public class Fighter {
	private kicking kick;
	private Punching punch;
	
	Fighter()
	{
		
	}
	
	public void performKick()
	{
		kick.kick();
	}
	
	public void performPunch()
	{
		punch.punch();
	}
	
	public void setKick(kicking kick)
	{
		this.kick = kick;
	}
	
	public void setPunch(Punching punch)
	{
		this.punch = punch;
	}
	
	public void jumb()
	{
		System.out.println("Jumbing");
	}
	
	public void roll()
	{
		System.out.println("Rolling");
	}
	
	
}
