package javalab;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaLab
{
	static Scanner sc;
	static ArrayList<Integer> a = new ArrayList<>();
	public static void main(String[] args) 
	{		
		fillArray(a);
		printArray(a);
		System.out.println("Enter value :");
		sc = new Scanner(System.in);
		int value = sc.nextInt();
		searchArray(value);
		bubbleSort(a);
		printArray(a);
	}
	public static void fillArray(ArrayList<Integer> arr)
	{
		System.out.println("Press \"-1\" to exit:");
		System.out.println("Enter values :");
		int i = 0;
		sc = new Scanner(System.in);
		do 
		{
			int temp = sc.nextInt();
			if (temp == - 1)
			{
				break;
			}
			arr.add(temp);
			i++;
		}while(arr.get(i - 1)!= -1);
	}
	public static void printArray(ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size(); i++) 
		{
			System.out.println(arr.get(i));
		}
	}
	public static void searchArray(int search)
	{
		boolean trueFalse = false;
		for (int i = 0; i < a.size(); i++)
		{
			if (search == a.get(i))
			{
				trueFalse = true;
				break;
			}			
		}
		if (trueFalse)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void bubbleSort (ArrayList<Integer> arr)
	{
		for (int i = 0; i < arr.size() -1; i++)
		{
			for (int j = 0; j < arr.size() -1; j++)
			{
				if (arr.get(j) > arr.get(j + 1))
				{
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}
	}	
}
