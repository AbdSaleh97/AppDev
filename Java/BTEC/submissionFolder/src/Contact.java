/*
 * @author Abdsaleh
 */
public class Contact 
{
	private String emial;
	private String phoneNumber;
	
	Contact()
	{
		
	}
	
	Contact(String email, String phoneNumber)
	{
		this.emial = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmial()
	{
		return emial;
	}
	
	public void setEmial(String email)
	{
		this.emial = email;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() 
	{
		return "ContactInfo{" + "emial=" + emial + ", phoneNumber=" + phoneNumber + '}';
	}
}
