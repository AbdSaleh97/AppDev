package midexam;
/*
 * @author Abdsaleh
 */
public class Checking extends BanckAccount implements Interest{
	
	public Checking()
	{
		
	}
	
	public Checking(int accountNumber, int balance, String accountHolderName)
	{
		super(accountNumber,balance,accountHolderName);	
	}
	
	@Override
	public void calculateInterest()
	{
		float interest = .3f;
		interest *= super.getBalance();
		
		super.setBalance(super.getBalance() + interest);
	}
	
}
