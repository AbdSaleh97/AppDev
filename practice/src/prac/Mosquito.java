/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac;

/**
 *
 * @author Abdsaleh
 */
public class Mosquito extends Insect implements Nuisance{

	
	public Mosquito(String species)
	{
		super(species);
	}
	public String buzz()
	{
		return super.getSpecies() + " buzzing around";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public String annoy()
	{
		return "buzz buzz buzz";
	}
	
}
