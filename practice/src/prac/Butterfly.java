/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac;

import java.util.List;

/**
 *
 * @author Abdsaleh
 */
public class Butterfly extends Insect{
	private List<String> colors;
	
	public Butterfly(String species,List<String> colors)
	{
		super(species);
		this.colors = colors;
	}
	
	public Butterfly(Butterfly butterfly)
	{
		super(butterfly.getSpecies());
		colors = butterfly.getColors();
	}
	
	public List<String> getColors()
	{
		return colors;
	}

	@Override
	public String toString() {
		return super.getSpecies() + " " + colors ;
	}
	
	
	
}
