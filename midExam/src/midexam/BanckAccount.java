package midexam;
/*
 * @author Abdsaleh
 */
public class BanckAccount {
	private int accountNumber;
	private float balance;
	private String accountHolderName;
	
	public BanckAccount()
	{
		
	}
	
	public BanckAccount(int accountNumber, float balance, String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "BanckAccount{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolderName=" + accountHolderName + '}';
	}
	
	public void deposit(float ammount)
	{
		balance += ammount;
	}
	
	public void withdraw(float ammount)
	{
		balance -= ammount;
	}
}
