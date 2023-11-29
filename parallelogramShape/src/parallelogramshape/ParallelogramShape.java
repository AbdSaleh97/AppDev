package parallelogramshape;

/*
 * @author Abdsaleh
 */
public class ParallelogramShape 
{
	public static void main(String[] args)
	{
		parallelogram();
	}
	
	public static void parallelogram()
	{
	/* i took this code from this website and edited it a little :
	https://1bestcsharp.blogspot.com/2015/04/java-how-to-create-parallelogram-star-program-in-java.html
		
	the original code : 
			
	   for(int i = 0; i < 10; i++){
            
            //loop for 40 stars
            for(int j = 0; j < 40; j++){
                System.out.print("*");
            }
             System.out.println();
             
             //loop for spaces
             for(int l = 0; l <= i; l++){
                System.out.print("  ");//two space
        */
	
	int i = 6 ;
	while(i > 0)
	{
		i--;
		for(int l = i; l >= 0; l--)
	    {
                System.out.print("  ");//two space
            }
		for(int j = 20; j > 0; j--)
	    {
                System.out.print("*");
            }
		System.out.println();
        }
    }

	/*
			this my mess 
	
	public static void parallelogram()
	{
		String a = "      ";
		String b = "     ";
		String c = "    ";
		String d = "   ";
		String e = "  ";
		String f = " ";
		int Ascii = 97 ;
		int z = 6 ;
		for(int i = 6 ; i > 0 ; i--)
		{
			while(z > 0)
			{
				if (i == z)
				System.out.print((char)Ascii);
				char y = (char)Ascii ;
				System.out.print((String)y);
			}
			z--;
			Ascii ++ ;
			System.out.println();

			for(int j = 0 ; j < 14 ; j++)
			{
				System.out.print("*");	
			}
			
		}
	}*/
}


