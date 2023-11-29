package btecassignment_1;

import java.util.*;
import java.io.*;

public class BtecAssignment_1
{
	static ArrayList<String> names = new ArrayList<>();
	static ArrayList<Integer> markOut60 = new ArrayList<>();
	static ArrayList<Integer> markOut40 = new ArrayList<>();
	static ArrayList<Integer> totalMark = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String teachName = sc.nextLine();
		
		System.out.println("Hello " + teachName + "\nDo you want to calculate the final students marks?");
		System.out.println("1.Yes\n2.No");
		int choose = sc.nextInt();
		
		switch(choose)
		{
			case 1 ->
			{
				startCalculation();
			}
			case 2 ->
			{
				System.exit(0);
			}
			default -> System.out.println("Invalid choice");
		}
	}
	public static void startCalculation()
	{
		Scanner sca ;
		try
		{
			File nameFile = new File ("names.txt");
			//access and read the already exiting files
			sca = new Scanner(nameFile);
			// store students names in array	
			while(sca.hasNextLine())
			{
//				String stName = sca.nextLine();
//				names.add(stName);
				names.add(sca.nextLine());

			}
			
			File mark_60File = new File("marks_60.txt");
			sca = new Scanner(mark_60File);
			while(sca.hasNextInt())
			{
//				int mark_60 = sca.nextInt();
//				markOut60.add(mark_60);
				markOut60.add(sca.nextInt());

			}// store marks of 60 in array
			
			File mark_40File = new File("final_exam_40.txt");
			sca = new Scanner(mark_40File);
			// store marks of 40 in array	
			while(sca.hasNextInt())
			{
//				int mark_40 = sca.nextInt();
//				markOut40.add(mark_40);
				markOut40.add(sca.nextInt());

			}
		}
		catch(Exception e)
		{
			System.out.println("File does not exist, please create and try again.");
		}
		try
		{
			/* i wrote it here cause we might need to calculate the total marks of the students in the other methodes , so instead of writing it multiple times in each methode i took the general appraoch that we need this caluctation to be done in the methodes and we may call just onece in one of them so we have to make sure that all of them has the required data so i wrote it here to be used by the methodes without the need to write the code multiple tiems and without any manipulation being caused on the original array(data).*/
			FileWriter finalMarksFile = new FileWriter("total_marks_100.txt");
			for (int i = 0; i < names.size(); i++)
			{
				//calculate total marks by adding mark_60 + mark_40
				totalMark.add(markOut60.get(i) + markOut40.get(i));
				// write the calculated data and store it in new file "total_marks_100"
				finalMarksFile.write(totalMark.get(i) + "\n");
			}
			//end of writing and save data
			finalMarksFile.close();
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		sca = new Scanner(System.in);
		// the option number
		int choice; 
		do
		{
			System.out.println("select a category: \n1.Show the final student's marks");
			System.out.println("2.Show the student's marks in descending order");
			System.out.println("3.Search for a specific mark\n4.Quit");

			choice = sca.nextInt();
			switch(choice)
			{
				case 1 -> 				
				{
					showFinalMarks();
				}	
				case 2 ->
				{
					showSortedMarks();
				}
				case 3 -> 				
				{	
					System.out.println("Enter the desired mark");
					sca = new Scanner(System.in);
					int searchMark = sca.nextInt();
					//pass the value we want to find
					checkMark(searchMark);
				}
				//terminate
				case 4 -> System.exit(0);
				
				default -> 
				{
					System.out.println("Invalid choice");
				}
			} 
			// checking if the user press 4 to terminate or not
			}while(choice != 4);
	}
	public static void showFinalMarks()
	{
		System.out.println("Student Name:\t Total Mark:\n");
		for (int i = 0; i < names.size(); i++) 
		{
			// print the students names and total marks 
			System.out.println(names.get(i) + "\t\t" + totalMark.get(i) );
		}
	}
	public static void showSortedMarks()
	{
		for (int i = 1; i < totalMark.size();i++)
		{
			int j = i - 1;
			//hold value temporally
			int temp = totalMark.get(i);
			//do until the value in temp is bigger than the value on its left and while j >= 0
			while (j >= 0 && totalMark.get(j) < temp)
			{
				//swap values
				totalMark.set(j +1, totalMark.get(j));
				j--;
			}
			//reset the value in temp into the next slot
			totalMark.set(j +1, temp);
		}
		for (int i = 0 ; i < totalMark.size(); i++)
		{
			System.out.println(totalMark.get(i));
		}
	}
	public static void checkMark(int desiredMark)
	{
		Scanner scan ;
		boolean cond = false;
		int temp = 0;
		try
		{
			File totalMarkFile = new File("total_marks_100.txt");
			scan = new Scanner(totalMarkFile);
			//check each value till we find the wanted one then break
			while (scan.hasNextLine())
			{
				temp = scan.nextInt();
				if (desiredMark == temp) 
				{
					cond = true;
					break;
				}
			}	
			scan.close();
		}
		catch(Exception e)
		{
			System.out.println("File does not exist, please create and try again.");
		}
		if (cond)
		{
			System.out.println("\"" + temp + "\"" + " the desired mark is found in the total mark");
		}
		else 
		{
			System.out.println("\"" +desiredMark + "\"" + " the desired mark is not found in the total mark");
		}
	}
}
