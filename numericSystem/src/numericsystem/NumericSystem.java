package numericsystem;

import java.util.Scanner;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class NumericSystem
{
	static JFrame frame = new JFrame("Converter");
	static Scanner sc = new Scanner(System.in);
	static JPanel panel = new JPanel();
	static JTextField t0;
	static JTextField t1;
	static JTextField t2;
	static JTextField t3;
	static JButton p;
	
	static ActionListener ac = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int x = Integer.parseInt(t1.getText(), Integer.valueOf(t0.getText()));
			String result = Integer.toString(x ,Integer.valueOf(t2.getText()));
			
			String s = e.getActionCommand();
			if (s.equals("Convert"))
			{
				t3.setText(String.valueOf(result));
			}
		}
	};
	public static void main(String[] args)
	{
		frame.setBounds(400, 200 , 500 ,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		addComponent(panel);
		frame.setVisible(true);
		
		
		System.out.print("Convert from Base: ");
		int firstBase = sc.nextInt();
		
		System.out.print("Enter number: ");		
		int num = Integer.parseInt(sc.next(), firstBase);
		
		System.out.print("Convert to base: ");
		int secondBase = sc.nextInt();
		String result = Integer.toString(num, secondBase);
		
		System.out.println(result.toUpperCase());
	}
	public static void addComponent(JPanel panel)
	{
		panel.setLayout(null);
		Font font = new Font("Courier", Font.BOLD , 20);
		JLabel infoLabel = new JLabel("Numeric Converter");
		infoLabel.setFont(font);
		infoLabel.setBounds(80, 10, 200, 20);
		panel.add(infoLabel);
		
		JLabel base1Label = new JLabel("Convert From Base");
		base1Label.setBounds(80, 50, 200, 20);
		panel.add(base1Label);
		
		JLabel numLabel = new JLabel("Enter Number");
		numLabel.setBounds(80, 110, 200, 20);
		panel.add(numLabel);
		
		JLabel base2Label = new JLabel("Convert To Base");
		base2Label.setBounds(80, 170, 200, 20);
		panel.add(base2Label);		
		
		JLabel resultLabel = new JLabel("Result");
		resultLabel.setBounds(80, 230 , 200, 20);
		panel.add(resultLabel);		
		
		t0 = new JTextField();
		t0.setSize(300, 30);
		t0.setLocation(80, 70);
		panel.add(t0);		
		
		t1 = new JTextField();
		t1.setSize(300, 30);
		t1.setLocation(80, 130);
		panel.add(t1);		
		
		t2 = new JTextField();
		t2.setSize(300, 30);
		t2.setLocation(80, 190);
		panel.add(t2);		
		
		t3 = new JTextField();
		t3.setSize(300, 30);
		t3.setLocation(80, 250);
		panel.add(t3);
		
		p = new JButton("Convert");
		p.setSize(90,40);
		p.setLocation(290, 300);
		panel.add(p);
		p.addActionListener(ac);
	}
	
	
//	public void actionPerformed(ActionEvent e)
//	{
//        String s = e.getActionCommand();
//        if (s.equals("Convert")) 
//	{
//		int firstBase = sc.nextInt();
//		System.out.print("Enter number: ");		
//		int num = Integer.parseInt(sc.next(), firstBase);
//		
//		System.out.print("Convert to base: ");
//		int secondBase = sc.nextInt();
//		String result = Integer.toString(num, secondBase);
//		
//	}
//	}


	
	
	
	public static void numericSys()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("From: ");
		String firstSystem = sc.next();
		System.out.println("To: ");
		String secondSystem = sc.next();
		int testSub;
		
		if(firstSystem.equals("decimal"))
		{
			switch(secondSystem)
			{
				case "octal" ->
				{
					System.out.println("Enter value: ");
					testSub = sc.nextInt();
					System.out.println(Integer.toOctalString(testSub));
				}
				case "hex" ->
				{
					System.out.println("Enter value: ");
					testSub = sc.nextInt();
					int rem;
					String hex="";   
					char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
					while(testSub > 0 )  
					{  
					rem = testSub % 16;   
					hex = hexchars[rem] + hex;   
					testSub /= 16;  
					}
					System.out.println(hex);
				}
				case "binary" ->
				{
					System.out.println("Enter value: ");
					testSub = sc.nextInt();
					int binary[] = new int[40];    
					int index = 0;    
					while(testSub > 0)
					{    
					binary [index++] = testSub % 2;    
					testSub = testSub / 2;    
					}    
					for(int i = index-1;i >= 0;i--)
					{    
					System.out.print(binary[i]);
					}
				}	
			default -> System.out.println("Invalid value.");
			}	
		}
		else if(firstSystem.equals("binary"))
		{
			switch(secondSystem)
			{
				case "decimal" ->
				{
					System.out.println("Enter value: ");
					testSub = sc.nextInt();
					String temp = String.valueOf(testSub);
					int result = Integer.parseInt(temp, 2);
					System.out.println(result);
				}
				case "octal" ->
				{
					System.out.println("Enter value: ");
					testSub = Integer.parseInt(sc.next(), 2);
					String result = Integer.toOctalString(testSub);
					System.out.println(result);
				}
				case "hex" ->
				{
					System.out.println("Enter value: ");
					testSub = Integer.parseInt(sc.next(), 2);
					String result = Integer.toHexString(testSub);
					System.out.println(result);
				}
				default -> System.out.println("Invalid value.");
			}
		}
		else if(firstSystem.equals("octal"))
		{			
			switch(secondSystem)
			{
				case "decimal" ->
				{
					System.out.println("Enter value: ");
					testSub = Integer.parseInt(sc.next(), 8);
					String result = Integer.toString(testSub, 10);
					System.out.println(result);
				}
				case "binary" ->
				{
					testSub = Integer.parseInt(sc.next(), 8);
					String result = Integer.toString(testSub, 2);
					System.out.println(result);
				}
				case "hex" ->
				{
					testSub = Integer.parseInt(sc.next(), 8);
					String result = Integer.toString(testSub, 16);
					System.out.println(result);
				}
				default -> System.out.println("Invalid value.");
			}
		}
		else
		{
			switch(secondSystem)
			{
				case "octal" ->
				{
					testSub  = Integer.parseInt(sc.next(), 16);
					String result = Integer.toString(testSub, 8);
					System.out.println(result);
				}
				case "binary" ->
				{
					testSub = Integer.parseInt(sc.next(), 16);
					String result = Integer.toString(testSub, 2);
					System.out.println(result);
				}
				case "decimal" ->
				{
					testSub = Integer.parseInt(sc.next(), 16);
					String result = Integer.toString(testSub, 10);
					System.out.println(result);
				}
				default -> System.out.println("Invalid value.");
			}
		}
	}
}
