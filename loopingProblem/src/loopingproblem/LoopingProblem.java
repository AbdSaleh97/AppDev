package loopingproblem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abdsaleh
 */
public class LoopingProblem 
{
	static int []input;
	static int counter = 0;
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
	
        int q = sc.nextInt();
        
        if(q > 0 && q <= 500)
        {
            input = new int[q*3];
        
            for(int i = 0 ;i < q*3 ;i++)
            {
                input[i] = sc.nextInt();
            }
	    int end = 0;
	    int beg = 0;
           
            counter = 0;
            for(int i = 0 ;i < q ;i++)
	    {
                int[] subarray = new int [end - beg +1];
                solution(subarray);
                counter += 3;
		end += 3;
		beg += 3;
		System.out.println();
            }
	}
        sc.close();
    }
   
    public static void solution( int []output)
    {
          for(int i = 0; i < 3; i++)
            {
                output = new int[input[counter] + 2]; 
                
                output[i] = input[counter] + input[counter + 1];// * (int)Math.pow(2,0) (2 to the power 0 equals 1 so its not needed)
                
                for(int j = 1 ; j <= i ; j++)
                {
                    output[i] += ((int)Math.pow(2,j) * input[counter + 1]);
                }
                System.out.print(output[i] + " ");                
            }
    }
    
//     public static int subArray( int []array, int beg, int end)
//    {
////      return Arrays.copyOfRange(array, beg, end + 1);
//	return Arrays.copyOfRange(array, beg, end + 1);
//    }
}
	

