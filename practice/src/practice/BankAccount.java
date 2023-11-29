package practice;
/*
 * @author Abdsaleh
 */
public class BankAccount
{
	private String accountNumber;
	private double balance;
	
	public BankAccount()
	{
		
	}
	
	public BankAccount(String accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	@Override
	public String toString()
	{
		return "Account Number is: " + accountNumber + "\nBalance: " + balance;
	}
	
	public double withdraw(double withdrawAmmount)
	{
		setBalance(balance - withdrawAmmount);
		return getBalance();
	}
}