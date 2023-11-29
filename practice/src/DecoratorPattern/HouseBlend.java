/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Abdsaleh
 */
public class HouseBlend extends Beverage {
	
	
	@Override
	public double getCost()
	{
		return 1.1;
	}
	
	@Override
	public String getDescription()
	{
		return "House Blend";
	}
	
}
