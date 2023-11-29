package midexam;
/*
 * @author Abdsaleh
 */
public class Saving extends BanckAccount implements Interest{
	public Saving(int accountNumber, int balance, String accountHolderName)
	{
		super(accountNumber,balance,accountHolderName);
	}
	
	public Saving()
	{
		
	}
	
	@Override
	public void calculateInterest()
	{
		float interest = .3f;
		interest *= super.getBalance();
		
		super.setBalance(super.getBalance() + interest);
	}
	
}
