package midexam;
/*
 * @author Abdsaleh
 */
public class Transaction {
	public void tranfer(BanckAccount sender, float ammount,BanckAccount reciver)
	{
		sender.withdraw(ammount);
		reciver.deposit(ammount);
	}
	
}
