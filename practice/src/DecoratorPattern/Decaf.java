/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Abdsaleh
 */
public class Decaf extends Beverage{
	
	@Override
	public double getCost()
	{
		return 1.0;
	}
	
	@Override
	public String getDescription()
	{
		return "Decaf";
	}
}
