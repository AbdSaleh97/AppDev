/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac;

/**
 *
 * @author Abdsaleh
 * @param <E>
 */
import java.util.ArrayList;
import java.util.List;


public class ColorList<E> {
	private List<E> colorList = new ArrayList<E>();
	
	public void addColor(E color)
	{
		colorList.add(color);
	}
	
	public E getColor(int index)
	{
		return colorList.get(index);
	}
	
	public List<E> getColorList()
	{
		return colorList;
	}
	
}
