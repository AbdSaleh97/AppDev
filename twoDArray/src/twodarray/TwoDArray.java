package twodarray;

public class TwoDArray 
{

	public static void main(String[] args)
	{
		int[][] a = new int [4][5];
		
		System.out.println("Enter vlaues :");
		
		int temp = 1 ;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
//				a [i][j] = sc.nextInt();
//				a[i][j] = (int)(Math.random()*10);
				a[i][j] = 1 + temp;
				temp++;
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("********");
		
		// prints the average for each student 
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				sum += a[i][j];	
			}
			System.out.println((float)sum / a[i].length);
			sum = 0;
		}
		
		sum = 0;
//		System.out.println("***************");
		for (int i = 0; i < a[0].length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				sum += a[j][i];
			}
			System.out.println("course average = "+(float)sum / a.length);
			sum = 0;
		}
		int mul = 1;
		
		// multiplication of left diagonals values
		for (int i = 0; i < a.length; i++)
		{
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
		
		for (int i = 0, j = a.length -1; i < a.length; i++ , j--)
		{
			System.out.println(a[i][j]); 
//			x--;
		}
		int max = a[0][0];
		
		for (int i = 1; i < a[0].length; i++)
		{
			// find the highest score for student 1
			if (a[0][i] > max)
			{
				max = a[0][i];
			}
		}
		System.out.println(max);
		
		
		System.out.println("abdelrahman".indexOf('h'));
	}
	
	
}
