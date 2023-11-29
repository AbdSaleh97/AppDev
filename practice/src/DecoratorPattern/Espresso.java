/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Abdsaleh
 */
public class Espresso extends Beverage{
	
	@Override
	public double getCost()
	{
		return 1.5;
	}
	
	@Override
	public String getDescription()
	{
		return "Espresso";
	}
	
}
