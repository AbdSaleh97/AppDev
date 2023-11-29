/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac;

/**
 *
 * @author Abdsaleh
 */
public class Insect {
	private String species;
	
	public Insect(String species)
	{
		this.species = species;
	}
	public String getSpecies()
	{
		return species;
	}
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + ": " +species; 
	}
		
	
}
