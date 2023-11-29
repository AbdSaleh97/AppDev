package shapes;


public class Shapes {


	public static void main(String[] args)
	{
//		X_Mas();
		HourGlass();
//		Triangle();
	}
	public static void X_Mas()
	{
		for (int z = 0 ; z < 3 ; z ++)
		{
			for (int i = 5 ; i > 0 ; i--)
			{
				for(int j = i ; j < 5 ; j++)
				{
					System.out.print("*");
				}
			System.out.println("*");				
		}
		}
	}
	public static void HourGlass()
	{
		for (int i = 0 ; i < 6 ; i++)
			{
			for(int j = i ; j < 5 ; j++)
				{
				System.out.print(" *");
				}
			System.out.println(" *");				
		}	
		for (int i = 5 ; i > 0 ; i--)
			{
			for(int j = i ; j < 6 ; j++)
			{
				System.out.print("*");
			}
			System.out.println(" *");				
		}
	}
	public static void Triangle()
	{
		int i = 10 ;
		while (i > 0)
		{
			int j = i ;
			while(j < 10 )
			{
				System.out.print('*');
				j++;
			}
			System.out.println('*');
			i--;
		}
	}	
}
