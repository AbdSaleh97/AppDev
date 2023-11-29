package midexam;
/*
 * @author Abdsaleh
 */
public class BanckTester {
	public static void main(String []args)
	{
		BanckAccount b1 = new Saving(83472,1000,"Abdelrahman");
		
		BanckAccount b2 = new Checking(7582,1500,"Ahmad");
		
		BanckAccount b3 = new Credit(35235,2000,"saif");
		
		
		Transaction c = new Transaction();
		
		c.tranfer(b3, 100, b1);
		
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
		System.out.println(b3.getBalance());
		
		b1.deposit(100);
		
		System.out.println(b1.getBalance());

		b1.withdraw(200);
		
		System.out.println(b1.getBalance());
		
		Saving s1 =(Saving)b1;
		s1.calculateInterest();
		
		System.out.println(b1.getBalance());
		
		
		System.out.println(b2.getBalance());
		
		Checking c1 = (Checking)b2;
		c1.calculateInterest();
		
		System.out.println(b2.getBalance());
		
	}
	
}
