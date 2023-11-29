package btechassignment_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class date 
{
	int year ;
	int month;
	int day;
	String getval()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		// month is zero based so we -1
		cal.set(this.year, this.month -1, this.day);
		String formatedDOB = format.format(cal.getTime());
		return formatedDOB;
	}
	date(int year, int month, int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}	
}

class student 
{
	String stdFName;
	String stdLName;
	int stdId;
	String stdEmail;
	float stdGpa;
	String gender;
	date date;
	
	student(String stdFName,
		String stdLName,
		int stdId,
		String stdEmail,
		float stdGpa, 
		date date,
		String gender)
	{
		this.stdFName = stdFName;
		this.stdLName = stdLName;
		this.stdId = stdId;
		this.stdEmail = stdEmail;
		this.stdGpa = stdGpa;	
		this.gender = gender;
		this.date = date;
	}
	
	public void print() 
	{
		System.out.println("Student's first name: " +stdFName);
		System.out.println("Student's Last name: " +stdLName);
		System.out.println("Student's email address: " + stdEmail);
		System.out.println("Student's ID number: " + stdId);
		System.out.println("Student's GPA: " + stdGpa);
		System.out.println("Student's Birth of date: " + date.getval());
		System.out.println("Student's Gender: " + gender);
	}
}

public class stdFrame extends JFrame 
{
	JButton addStudent;
	JButton printAllStudents;
	JButton clear;

	JRadioButton male;
	JRadioButton female;

	private JTextField stdFName;
	private JTextField stdLName;
	private JTextField stdId;
	private JTextField stdEmail;
	private JTextField stdGpa;

	private JComboBox year;
	private JComboBox month;
	private JComboBox day;

	ButtonGroup group;
	JPanel panel;
	
	ArrayList<student> objArr = new ArrayList<>();

	stdFrame() 
	{
		//seting the size and title of the window
		this.setTitle("Stuedent Enrolment");
		this.setBounds(350, 150, 550, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//creating a panel to add every component to 
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#D3D1D5"));

		//change the icon image of the window
		ImageIcon image = new ImageIcon("Logo33-01.png");
		this.setIconImage(image.getImage());

		//the main title of the program
		JLabel label = new JLabel();
		label.setText("New Student Registration Form");
		label.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		label.setBounds(200, 20, 300, 30);
		panel.add(label);

		//student first name text field
		stdFName = new JTextField();
		stdFName.setSize(260, 30);
		stdFName.setLocation(200, 70);
		panel.add(stdFName);

		//its label with the positioning 
		JLabel stdFNameLabel = new JLabel();
		stdFNameLabel.setText("Student First Name");
		stdFNameLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdFNameLabel.setBounds(15, 70, 200, 30);
		panel.add(stdFNameLabel);

		stdLName = new JTextField();
		stdLName.setSize(260, 30);
		stdLName.setLocation(200, 110);
		panel.add(stdLName);

		JLabel stdLNameLabel = new JLabel();
		stdLNameLabel.setText("Stedent Last Name");
		stdLNameLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdLNameLabel.setBounds(15, 110, 200, 30);
		panel.add(stdLNameLabel);

		stdId = new JTextField();
		stdId.setSize(260, 30);
		stdId.setLocation(200, 150);
		panel.add(stdId);

		JLabel stdIdLabel = new JLabel();
		stdIdLabel.setText("Student ID");
		stdIdLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdIdLabel.setBounds(15, 150, 200, 30);
		panel.add(stdIdLabel);

		stdEmail = new JTextField();
		stdEmail.setSize(260, 30);
		stdEmail.setLocation(200, 190);
		panel.add(stdEmail);

		JLabel stdEmailLabel = new JLabel();
		stdEmailLabel.setText("Student Email");
		stdEmailLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdEmailLabel.setBounds(15, 190, 200, 30);
		panel.add(stdEmailLabel);

		stdGpa = new JTextField();
		stdGpa.setSize(260, 30);
		stdGpa.setLocation(200, 230);
		panel.add(stdGpa);

		JLabel stdGpaLabel = new JLabel();
		stdGpaLabel.setText("Student GPA");
		stdGpaLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdGpaLabel.setBounds(15, 230, 200, 30);
		panel.add(stdGpaLabel);

		JLabel stdBodLabel = new JLabel();
		stdBodLabel.setText("Birth Of Date");
		stdBodLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
		stdBodLabel.setBounds(15, 290, 200, 30);
		panel.add(stdBodLabel);

		//intilize a button called addSudent with its positioning
		addStudent = new JButton();
		addStudent.setBounds(15, 440, 135, 30);
		addStudent.setText("Add Student");
		panel.add(addStudent);
		//adding action listener to implemnt an action
		addStudent.addActionListener(new ActionListener() 
		{
			//do action if this button is pressed
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//call add method
				add();
			}
		});
		printAllStudents = new JButton();
		printAllStudents.setBounds(200, 440, 135, 30);
		printAllStudents.setText("print All Students");
		panel.add(printAllStudents);
		printAllStudents.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//call the print method
				prnt();
			}
		});
		clear = new JButton();
		clear.setBounds(385, 440, 135, 30);
		clear.setText("clear");
		panel.add(clear);
		clear.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//clears all the fields
				clearMeth();
			}
		});
		//initilize a radio button
		male = new JRadioButton("Male");
		male.setBounds(310, 350, 20, 30);
		panel.add(male);

		JLabel maleLabel = new JLabel();
		maleLabel.setText("Male");
		maleLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
		maleLabel.setBounds(330, 350, 70, 30);
		panel.add(maleLabel);

		female = new JRadioButton("Female");
		female.setBounds(195, 350, 20, 30);
		panel.add(female);

		JLabel femaleLabel = new JLabel();
		femaleLabel.setText("Female");
		femaleLabel.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 14));
		femaleLabel.setBounds(215, 350, 70, 30);
		panel.add(femaleLabel);

		//intilize a combo box 
		year = new JComboBox();
		year.setBounds(155, 290, 70, 30);
		//retrive the current year 
		LocalDate date = LocalDate.now();
//		fill the year box of the past 100 year starting from the current year
		for (int y = date.getYear() - 100; y <= date.getYear(); y++) 
		{
			year.addItem(y);
		}
		panel.add(year);

		month = new JComboBox();
		month.setBounds(260, 290, 70, 30);
		for (int m = 1; m <= 12; m++)
		{
			month.addItem(m);
		}
		panel.add(month);

		day = new JComboBox();
		day.setBounds(370, 290, 70, 30);
		for (int d = 1; d <= 31; d++)
		{
			day.addItem(d);
		}
		panel.add(day);

		//group the radio buttons together to prevent pressing the two of them together 
		group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
		//make the window visible
		this.setVisible(true);
	}

	public void clearMeth() 
	{
		// reset the values in the text field to empty 
		stdFName.setText("");
		stdLName.setText("");
		stdId.setText("");
		stdEmail.setText("");
		stdGpa.setText("");
		//clear the buttons in the group
		group.clearSelection();
		//make the box option null
		year.setSelectedItem(null);
		month.setSelectedItem(null);
		day.setSelectedItem(null);
	}
	public void prnt() 
	{
		//print out the data we saved in it from the object
		for (int j = 0; j < objArr.size(); j++)
		{
			objArr.get(j).print();
		}
	}
	public void add()
	{
		//checks wether the value in the students field is null or not
		//do not add any null value to the array 
		if (checkNull())
		{
			//if the field is empty tell user to fill it
			System.out.println("Fill all the fields please");
		} 
		else 
		{	
			checkGender();
			
			//make an instance of date class
			date std_BOD = new date(getYear(),
			getMonth(),
			getDay());
			
			//creating an object form student class	
			student std = new student(getStdFName(),getStdLName(), getStdId(), getStdEmail(),getStdGpa(),std_BOD,getGroup().getSelection().getActionCommand());
			
			//save this object in an array of objects
			objArr.add(std);
		}
		
	}
	public boolean checkNull()
	{
		if(stdFName.equals("")
			|| stdLName.equals("")
			|| stdId.equals("")
			|| stdEmail.equals("")
			|| stdGpa.equals("")
			|| (!male.isSelected() && !female.isSelected()))
			return true;
		else 
			return false;
	}
	
	public void checkGender()
	{
		if (female.isSelected()) 
		{
			group.getSelection().setActionCommand("Female");
		}
		else
			group.getSelection().setActionCommand("Male");
	}
	
	public int getDay() {
		return Integer.parseInt(day.getSelectedItem().toString());
	}

	public String getStdFName() {
		return stdFName.getText();
	}

	public String getStdLName() {
		return stdLName.getText();
	}

	public int getStdId() {
		return Integer.parseInt(stdId.getText());
	}

	public String getStdEmail() {
		return stdEmail.getText();
	}

	public float getStdGpa() {
		return Float.parseFloat(stdGpa.getText());
	}

	public int getYear() {
		return Integer.parseInt(year.getSelectedItem().toString());
	}

	public int getMonth() {
		return Integer.parseInt(month.getSelectedItem().toString());
	}

	public ButtonGroup getGroup() {
		return group;
	}
}
