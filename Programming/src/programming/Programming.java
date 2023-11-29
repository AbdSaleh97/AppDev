package programming;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.regex.MatchResult;

public class Programming {

	public static final String B = "\u001B[31m";
	public static final String C = "\u001B[41m";
	public static Scanner sc ;

	public static void main(String[] args) {
//		iteration();
//		personalInfo();
//		sum();
//		convert();
//		ifElseProb();
//		fibonacci();
//		ArrayPractice();
//		twoDArray();
//		rowClomun();
//		prac();
//		fileR_W();

		/*String i = "1 fish 2 fish red fish blue fish";
		sc = new Scanner(i).useDelimiter("\\s*fish\\s*");
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();*/
		
		String s = "Ilove that Ihate that Ilove that Ihate it";
		sc = new Scanner(s);
		sc.findInLine("(\\w+) that (\\w+) that (\\w+) that (\\w+)");
		MatchResult result = sc.match();
		for (int i = 1; i <= result.groupCount(); i++)
		{
			System.out.println(result.group(i));
		}
		sc.close();
		
		

	}

	public static void fileR_W() 
	{
		ArrayList<String> arr = new ArrayList<>();
		
		try 
		{
//			String writePath = "C:\\Users\\Abdsaleh\\Desktop\\test.txt";
			String readPath = "C:\\Users\\Abdsaleh\\Desktop\\LTUC_Program.txt";
			
			File test = new File(readPath);
			Scanner ob = new Scanner(test);
//			Scanner input = new Scanner(System.in);
			while(ob.hasNextLine())
			{
				String s = ob.nextLine();
				arr.add(s);
			}
			ob.close();

			FileWriter file = file = new FileWriter("C:\\Users\\Abdsaleh\\Desktop\\LTUC_Program.txt");
			for (int i = 0; i < arr.size(); i++) 
			{
				file.write(arr.get(i) + "2022");
			}
			file.close();

			
			

//			file.write(input.nextLine());
			
//			input.close();
			
			
							
			
//			String data = ob.nextLine();
//			System.out.println(data);

		} 
		catch (IOException e)
		{
			System.out.println("An error occurred.");
//			e.printStackTrace();
		}

	}

	public static void prac() {
//		String email = sc.next();
////		email.charAt(email.length() -1).equals("m");
//		String temp = email.substring(email.length() -4 , email.length());
//		if (email.contains(".com") && temp.equals(".com"))
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}	
	}

	public static void iteration() {
		int i = 2;
//		for(; i <= 6; i += 2)
		if (i <= 6) {
			System.out.println(C + B + (i + 1));
			i += 2;
		}
	}

	public static void personalInfo() {
		System.out.println("Enter your NAME :");
		String name = sc.nextLine();

		System.out.println("Enter your AGE :");
		int age = sc.nextInt();

		System.out.println("Enter your GPA :");
		double gpa = sc.nextDouble();

		System.out.println("My name is " + name + ", and my age is " + age);
		System.out.println("My GPA is " + gpa);
	}

	public static void sum() {
		System.out.println("Enter 5 numbers :");
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();
			sum += temp;
		}
		System.out.println(B + sum);
	}

	public static void convert() {
		int cnt = 10;
		do {
			System.out.println(cnt);
			cnt--;
		} while (cnt >= 0);
	}

	public static void ifElseProb() {
		int N = sc.nextInt();
		if (N <= 100 && N >= 1) {
			if (N % 2 == 1) {
				System.out.println("Weird");
			} else if (N % 2 == 0 && N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N % 2 == 0 && N >= 6 && N <= 20) {
				System.out.println("Weird");
			} else if (N % 2 == 0 && N >= 20) {
				System.out.println("Not Weird");
			} else {

			}
		}
	}

	public static void fibonacci() {
		int fibonacci[] = new int[11];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < 11; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		for (int i = 0; i < 11; i++) {
			System.out.println("Index:\t\tFibonacci:\n" + i + "\t\t" + fibonacci[i]);
		}
	}

	public static void ArrayPractice() {

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

	public static void practice() {
		ArrayList<Integer> arr = new ArrayList<>();

		int sum = 0;
		int avg = 1;

		System.out.println("Insert Value: ");
		int index = sc.nextInt();

		while (index != -1) {
			arr.add(index);
			index = sc.nextInt();

//			System.out.print("Press y or Y to stop, n to continue. ");
//			char stop = sc.next().charAt(0);
//			
//			if (stop == 'y' || stop == 'Y')
//			{
//				break;
//			}
		}
		for (int i = 0; i < arr.size(); i++) {
//			arr.set(i, arr.get(i) + 10);
			sum += arr.get(i);
		}

		avg = sum / arr.size();
		System.out.println(sum + "\n" + avg);

//		int i = sc.nextInt();
//		Double d = sc.nextDouble(); 
//		char s = sc.next().charAt(0);
//		String s = sc.nextLine();
//		System.out.println("String: " + s);
//		System.out.println("Double: " + d);
//		System.out.println("Int: " + i);
	}

	public static void twoDArray() {
		int[][] a = new int[4][5];

		System.out.println("Enter vlaues :");

		int temp = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				a [i][j] = sc.nextInt();
//				a[i][j] = (int)(Math.random()*10);
				a[i][j] = 1 + temp;
				temp++;
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("********");

		// prints the average for each student 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			System.out.println((float) sum / a[i].length);
			sum = 0;
		}

		sum = 0;
//		System.out.println("***************");
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum += a[j][i];
			}
			System.out.println("course average = " + (float) sum / a.length);
			sum = 0;
		}
		int mul = 1;

		// multiplication of left diagonals values
		for (int i = 0; i < a.length; i++) {
			mul *= a[i][i];
		}

		System.out.println(mul);
		/*
		
		5 -> 0,3
		9 -> 1,2
		13 -> 2,1
		17 -> 3,0
		
		
		 */
//		int x = a.length -1;

		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			System.out.println(a[i][j]);
//			x--;
		}
		int max = a[0][0];

		for (int i = 1; i < a[0].length; i++) {
			// find the highest score for student 1
			if (a[0][i] > max) {
				max = a[0][i];
			}
		}
		System.out.println(max);
	}

	public static void rowClomun() {
		int[][] arr = new int[3][4];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1 + temp;
				temp++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("**************");

		ArrayList<Integer> rowSum = new ArrayList<>();
		ArrayList<Integer> columnSum = new ArrayList<>();

		int sumRow = 0;
		int sumColumn = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sumRow += arr[i][j];
			}
			rowSum.add(sumRow);
			sumRow = 0;
		}

		for (int i = 0; i < rowSum.size(); i++) {
			System.out.println("Sum of Row " + i + ": " + rowSum.get(i));
		}

		System.out.println("**************");

		int index = 0;

		for (int i = 0; i < arr[index].length; i++) {
			if (index < arr.length - 1) {
				index++;
			}

			for (int j = 0; j < arr.length; j++) {
				sumColumn += arr[j][i];
			}
			columnSum.add(sumColumn);
			sumColumn = 0;
		}

		for (int i = 0; i < columnSum.size(); i++) {
			System.out.println("Sum of Column " + i + ": " + columnSum.get(i));
		}
	}
}
