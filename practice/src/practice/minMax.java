package practice;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class minMax 
{
	public static void main(String []args)
	{
		int []arr = {543,2,7,27,45};
		res(arr);
	}
	
	public static void res(int[]arr)
	{
		 int n = arr.length;
        
        for(int i = 1; i < n ; i++)
        {
            int key = arr[i];
            int j = i -1;
            
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1] = key;
        }
    
    
        long sumMin = 0;
        long sumMax = 0;
        for (int i = 0; i < arr.length -1; i++) 
        {
            sumMin += arr[i];
        }
        
        for (int i = arr.length -1; i > 0; i--)
        {
            sumMax += arr[i];
        }
        
        System.out.println(sumMin + " " + sumMax);

		
	}
}
