//package btechassignment_2;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//
//
//public class myFrame extends JFrame implements ActionListener
//{
//	JButton addStudent;
//	JButton printAllStudents;
//	JButton clear;
//	
//	JRadioButton male;
//	JRadioButton female;
//	
//	JTextField stdFName;
//	JTextField stdLName;
//	JTextField stdId;
//	JTextField stdEmail;
//	JTextField stdGpa;
//	
//	JComboBox year;
//	
//	ButtonGroup group;
//	
//	JPanel panel;
//	
////	ArrayList<myFrame> stdFirstNames = new ArrayList<>();
////	ArrayList<myFrame> stdLastNames = new ArrayList<>();
////	ArrayList<myFrame> stdIdNum = new ArrayList<>();
////	ArrayList<myFrame> stdEmailAdd = new ArrayList<>();
////	ArrayList<myFrame> stdGpaScore = new ArrayList<>();
////	ArrayList<myFrame> stdGender = new ArrayList<>();
////	
//	public void frame()
//	{
//		
//	}
//	
//	myFrame()
//	{
//		this.setTitle("Stuedent Enrolment");
//		this.setBounds(250, 300 , 550 ,550);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		panel = new JPanel();
//		this.add(panel);
//		panel.setLayout(null);
//		panel.setBackground(Color.decode("#D3D1D5"));
//	
//		ImageIcon image = new ImageIcon("Logo33-01.png");
//		this.setIconImage(image.getImage());
//		
//		JLabel label = new JLabel();
//		label.setText("New Student Registration Form");
//		label.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		label.setBounds(200, 20, 300, 30);
//		panel.add(label);
//		
//		stdFName = new JTextField();
//		stdFName.setSize(260, 30);
//		stdFName.setLocation(200, 70);
//		panel.add(stdFName);
//		
//		JLabel stdFNameLabel = new JLabel();
//		stdFNameLabel.setText("Student First Name");
//		stdFNameLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdFNameLabel.setBounds(15, 70, 200, 30);
//		panel.add(stdFNameLabel);
//
//		stdLName = new JTextField();
//		stdLName.setSize(260, 30);
//		stdLName.setLocation(200, 110);
//		panel.add(stdLName);
//		
//		JLabel stdLNameLabel = new JLabel();
//		stdLNameLabel.setText("Stedent Last Name");
//		stdLNameLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdLNameLabel.setBounds(15, 110, 200, 30);
//		panel.add(stdLNameLabel);
//		
//		stdId = new JTextField(); 
//		stdId.setSize(260, 30);
//		stdId.setLocation(200, 150);
//		panel.add(stdId);
//		
//		JLabel stdIdLabel = new JLabel();
//		stdIdLabel.setText("Student ID");
//		stdIdLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdIdLabel.setBounds(15, 150, 200, 30);
//		panel.add(stdIdLabel);
//		
//		stdEmail = new JTextField(); 
//		stdEmail.setSize(260, 30);
//		stdEmail.setLocation(200, 190);
//		panel.add(stdEmail);
//
//		JLabel stdEmailLabel = new JLabel();
//		stdEmailLabel.setText("Student Email");
//		stdEmailLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdEmailLabel.setBounds(15, 190, 200, 30);
//		panel.add(stdEmailLabel);
//		
//		stdGpa = new JTextField(); 
//		stdGpa.setSize(260, 30);
//		stdGpa.setLocation(200, 230);
//		panel.add(stdGpa);
//		
//		JLabel stdGpaLabel = new JLabel();
//		stdGpaLabel.setText("Student GPA");
//		stdGpaLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdGpaLabel.setBounds(15, 230, 200, 30);
//		panel.add(stdGpaLabel);
//		
//		JLabel stdBodLabel = new JLabel();
//		stdBodLabel.setText("Student Birth of date");
//		stdBodLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,20));
//		stdBodLabel.setBounds(15, 290, 200, 30);
//		panel.add(stdBodLabel);
//		
//		addStudent = new JButton();
//		addStudent.setBounds(15, 440, 135, 30);
//		addStudent.setText("Add Student");
//		panel.add(addStudent);
//		addStudent.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				if(e.getSource() == addStudent)
//				{
//					new sv_dis().addVal();
//				}
//			}	
//		});
//		
//		printAllStudents = new JButton();
//		printAllStudents.setBounds(200, 440, 135, 30);
//		printAllStudents.setText("print All Students");
//		panel.add(printAllStudents);
//		printAllStudents.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				if (e.getSource() == printAllStudents)
//				{
////					new sv_dis().printVal();
//				}
//			}	
//		});
//		
//		clear = new JButton();
//		clear.setBounds(385, 440, 135, 30);
//		clear.setText("clear");
//		panel.add(clear);	
//		clear.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				if (e.getSource() == clear)
//				{
////					new sv_dis().clearMeth();
//				}
//			}	
//		});
//		
//		male = new JRadioButton("Male");
//		male.setBounds(310, 350, 20, 30);
//		panel.add(male);
//		
//		JLabel maleLabel = new JLabel();
//		maleLabel.setText("Male");
//		maleLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,14));
//		maleLabel.setBounds(330, 350, 70, 30);
//		panel.add(maleLabel);
//		
//		female = new JRadioButton("Female");
//		female.setBounds(195, 350, 20, 30);
//		panel.add(female);
//		
//		JLabel femaleLabel = new JLabel();
//		femaleLabel.setText("Female");
//		femaleLabel.setFont(new Font("Times New Roman",Font.ROMAN_BASELINE,14));
//		femaleLabel.setBounds(215, 350, 70, 30);
//		panel.add(femaleLabel);
//		
////		JComboBox y = new JComboBox();
////		y.setBounds(330, 350, 70, 30);
////		panel.add(y);
//		
//		group = new ButtonGroup();
//		group.add(male);
//		group.add(female);
//		
//		this.setVisible(true);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e)
//	{
//		
//	}
//
////	public void clearMeth()
////	{
////		stdFName.setText("");
////		stdLName.setText("");
////		stdId.setText("");
////		stdEmail.setText("");
////		stdGpa.setText("");
////		group.clearSelection();
////	}
//	
////	public void saveData()
////	{	
////		stdFirstNames.add(stdFName.getText());
////		stdLastNames.add(stdLName.getText());
////		stdEmailAdd.add(stdEmail.getText());
////		stdIdNum.add(Integer.parseInt(stdId.getText()));
////		stdGpaScore.add(Integer.parseInt(stdGpa.getText()));
////		
////		if (male.isSelected())
////		{
////			stdGender.add(male.getText());
////		}
////		else if (female.isSelected())
////		{
////			stdGender.add(female.getText());
////		}
////		else
////			System.out.println("Please identify gender");
////	}
//	
////	public void printVal()
////	{
////		for (int i = 0; i < stdFirstNames.size(); i++) 
////		{
////			System.out.println(stdFirstNames.get(i));
////			System.out.println(stdLastNames.get(i));
////			System.out.println(stdEmailAdd.get(i));
////			System.out.println(stdIdNum.get(i));
////			System.out.println(stdGpaScore.get(i));
////			System.out.println(stdGender.get(i));
////			System.out.println("*********");
////		}	
////	}
//}
