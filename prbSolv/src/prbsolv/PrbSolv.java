package prbsolv;
/*
 * @author Abdsaleh
 */
import java.util.Scanner;
public class PrbSolv
{
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		System.out.println(sol(n));
		
//		int []arr = {3,5,6,6,6,6,3,2,2,6,6};
//		
//		System.out.println(findMajority(arr));
		
		int [][] arr = {{ 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				{17,18,19,20}};
		
		prntSpiralOrder(spiralOrder(6));
		

		/*int count = 0;
		while(count <= 10)
		{
		for (int i = 1; i < 6; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if (j == 3 || i == 2) 
				{
					System.out.printf("%2s","*");
				}
				else
				{
					System.out.printf("%2s"," ");
				}
			}
			System.out.println("");
		}
			System.out.println("ibrahim is gay");
			count++;
		}*/
		
		
//		rotateBy90(arr);
//		prnt(arr);

//		spiralMatrix(arr);
	}
	
	
	public static void prntSpiralOrder(int [][]arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[0].length; j++) 
			{
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println("");
		}
	}
	
	
	public static int[][] spiralOrder(int A)
	{		
		int [][] arr = new int[A][A];
		
		int range = A * A;
		int count = 1;

		int rmin = 0, rmax = A -1;
		int cmin = 0 , cmax = A-1;
		
		while(count <= range)
		{
			//top boundary
			for(int col = rmin; col <= cmax; col++)
			{
				arr[rmin][col] = count;
				count++;
			}
			rmin++;
			
			// right boundary
			for(int row = rmin; row <= rmax; row++)
			{
				arr[row][cmax] = count;
				count++;
			}
			cmax--;
		
			//bottom boundary
			for(int col = cmax; col >= cmin; col--)
			{
				arr[rmax][col] = count;
				count++;
			}
			rmax--;
		
			//left boundary
			for(int row = rmax; row >= rmin; row--)
			{
				arr[row][cmin] = count;
				count++;
			}
			cmin++;
		}
		return arr;
	}
	
	
	
	//print the matrix in a spiral order from top to right then botton eding with the left side
	public static void spiralMatrix(int [][]arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		
		int rmin = 0 , rmax = arr.length -1;
		int cmin = 0 , cmax = arr[0].length -1;
		
		int count = 0;
		// we will check the matix frame by frame, starting from the top to the right then bottom ending with the left frame.
		while(count < n * m)
		{
			//top boundary
			for(int col = cmin ; col <= cmax && count < n * m; col++)
			{
				System.out.print(arr[rmin][col] + " ");
				count++;
			}
			rmin++;
			
			// right boundary
			for(int row = rmin ; row <= rmax && count < n * m; row++)
			{
				System.out.print(arr[row][cmax] + " ");
				count++;
			}
			cmax--;
			// bottom boundary
			for(int col = cmax; col >= cmin && count < n * m; col--)
			{
				System.out.print(arr[rmax][col] + " ");
				count++;
			}
			rmax--;
			
			//left boundary
			for(int row = rmax; row >= rmin && count < n * m; row --)
			{
				System.out.print(arr[row][cmin] +" ");
				count++;
			}
			cmin++;
			
		}
			
	}
	
	
	
	
	
	public static void prnt(int [][]arr)
	{
		for(int[]a : arr)
		{
			for(int val : a )
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotateBy90(int [][]arr )
	{
		//first step is to do transpose
		
		for(int i = 0 ; i < arr.length; i++)
		{
			//swap arr[i][j] with arr[j][i]
			for(int j = i + 1; j< arr[i].length;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		
		// second step is to swap the columns that we did in the previous step
		int left = 0 , right = arr[0].length -1;
		while(left < right)
		{
			for(int i = 0 ; i < arr.length;i++)
			{
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
			}
			left++;
			right--;
		}
		
	}
	
	
	
	public static int findMajority(int []arr)
	{
		int candidate = arr[0];
		int count = 1;
		
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] == candidate) 
			{
				count++;
			}
			else
			{
				count--;
			}
			
			if (count == 0)
			{
				candidate = arr[i];
				count = 1;
			}
		}
		
		
		// verifying 
		count = 0;
		for (int val : arr)
		{
			if (val == candidate)
			{
				count++;
			}
		}
		
		if (count > arr.length/2) 
		{
			return candidate;
		}
		else
		{
			return -1;
		}
	}

	public static int sol(int n)
	{
		String ans = "";
		for (int div = 9;  div >= 2; div--)
		{
			while(n % div == 0)
			{
				n = n/div;
				ans = div + ans;
			}
		}
		
		if (n != 1)
		{
			return -1;
		}
		else
		{
			return Integer.parseInt(ans);
		}
	}
}
