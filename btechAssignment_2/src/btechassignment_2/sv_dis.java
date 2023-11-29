package btechassignment_2;

import java.util.ArrayList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * @author Abdsaleh
 */
public class sv_dis 
{
	ArrayList<JTextField> stdFirstNames = new ArrayList<>();
	ArrayList<JTextField> stdLastNames = new ArrayList<>();
	ArrayList<JTextField> stdIdNum = new ArrayList<>();
	ArrayList<JTextField> stdEmailAdd = new ArrayList<>();
	ArrayList<JTextField> stdGpaScore = new ArrayList<>();
	ArrayList<JRadioButton> stdGender = new ArrayList<>();
	
	//dummy value to prevent recursive calling
//	myFrame frame = new myFrame(1);

//	public void addVal()
//	{
//		stdFirstNames.add(frame.stdFName);
//		stdLastNames.add(frame.stdLName);
//		stdEmailAdd.add(frame.stdEmail);
//		stdIdNum.add(frame.stdId);
//		stdGpaScore.add(frame.stdGpa);
//		
//		if (frame.male.isSelected())
//		{
//			stdGender.add(frame.male);
//		}
//		else //if (frame.female.isSelected())
//		{
//			stdGender.add(frame.female);
//		}
////		else
////			System.out.println("Please identify gender");
//		
//		
//	}
//	
//	public void clearMeth()
//	{
//		frame.stdFName.setText("");
//		frame.stdLName.setText("");
//		frame.stdId.setText("");
//		frame.stdEmail.setText("");
//		frame.stdGpa.setText("");
//		frame.group.clearSelection();
//	}
//	
//	
//	public void printVal()
//	{
//		for (int i = 0; i < stdFirstNames.size(); i++) 
//		{
//			System.out.println(stdFirstNames.get(i).getText());
//			
//			System.out.println(stdLastNames.get(i).getText());
//			
//			System.out.println(stdEmailAdd.get(i).getText());
//		}
//		
//		for (int i = 0; i < stdIdNum.size(); i++)
//		{
//			System.out.println(Integer.parseInt(stdIdNum.get(i).getText()));
//			
//			System.out.println(Integer.parseInt(stdGpaScore.get(i).getText()));
//		}
//		
//		for (int i = 0; i < stdGender.size(); i++)
//		{
//			if (frame.male.isSelected())
//			{
//				System.out.println(frame.male.getText());
//			}
//			else //(frame.female.isSelected())
//			{
//				System.out.println(frame.female.getText());
//			}
//		}
//	}
}
