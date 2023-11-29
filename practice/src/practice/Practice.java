package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice 
{
	static int hello ;
	static Scanner sc;
	static int first;
	static int last;
	
	
	
	
	
	
	

	public static void main(String[] args)
	{
		
//		Animal a1 = new Animal();
//		a1.makeNoise();
//		Cat c1 = new Cat();
//		c1.makeNoise();
		
		Animal myCat = new Cat();
		myCat.makeNoise();
		
		Animal a1 = new Animal();
		a1.makeNoise();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Time t = new Time(8,7,9);
//		t.displayTime();
		
		
//		Person p = new Person("ahmad",25,'M');
//		System.out.println(p);
//		
//		Rectangle R = new Rectangle(16.6,12.2);
//		System.out.println(R);
//		System.out.println(R.area());
//		
//		Car c = new Car("Toyota","Camry",1997,"Red");
//		c.prnt();
		
//		BankAccount bank = new BankAccount("E1A245VE5",750.88);
//		
//		System.out.println(bank);
//		System.out.println(bank.withdraw(100));
//		
//		Student s = new Student("abdelrahamn",25,"Software engineer");
//		System.out.println(s);
//		s.prntStdInfo();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void x(int [] arr)
	{
		arr[0] = 12;
		arr[1] = 2;
	}
	
	public static double minValue(double a , double b, double c)
	{
//		hello = 100;
		
		if(a < b)
		{
			if(a < c)
				return a;
			else 
				return c;	
		}
		else if(b < c)
			return b;
		else
			return c;
	}
	
	public static void greating()
	{	
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		System.out.println("Welcome " + sc.nextLine());
		sc.close();
	}
	
	public static void temp()
	{
		sc = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int z = (a + b )* c ;
		
		System.out.println(z);
		
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		if (x > 0) 
		{
			System.out.println(x + " is positive");
		}
//		else
//		{
//			System.out.println(xx + " is negative");
//		}
	}
	
	public static int binarySearch(ArrayList<Integer> arr ,int val)
	{
		while(first <= last)
		{
			int mid = (last + first) / 2;
			
			if(arr.get(mid) == val)
			{
				return mid;
			}
			else if (val > arr.get(mid))
			{
				first = mid + 1;
			}
			else
			{
				last = mid - 1;
			}	
		}
		return -1;
	}
	
	public static void rabish()
	{
		////		greating();
//		int [] a = {16,32};
////		System.out.println(minValue(67,36,63));
////		System.out.println(hello);
//		System.out.println(a[0] +"  "+a[1]);
//		x(a);
//		System.out.println(a[0]+ "  "+a[1]);
		
		
		ArrayList<Integer> a = new ArrayList<>();
		sc = new Scanner(System.in);
		int val = 5;
		for (int i = 0; i < 10; i++) 
		{
			val++;
			a.add(val);
		}
		first = 0;
		last = a.size();
		System.out.println(binarySearch(a,1));
	}
	
}
