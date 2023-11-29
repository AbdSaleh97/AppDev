package gui;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.Font;

public class Gui 
{
	static JFrame frame = new JFrame("person Form");
	
	public static void main(String[] args)
	{	
		frame.setBounds(400, 200 , 500 ,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		addComponent(panel);
		frame.setVisible(true);
		
		
	}
	
	public static void addComponent(JPanel panel)
	{
		panel.setLayout(null);
		
		ArrayList<person> persons = new ArrayList<>();
		
		Font font = new Font("Courier", Font.BOLD , 18);
		
		JLabel infoLabel = new JLabel("person information");
		infoLabel.setFont(font);
		infoLabel.setBounds(80, 10, 200, 20);
		panel.add(infoLabel);
		
		
	}
	
}
