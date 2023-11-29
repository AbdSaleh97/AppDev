package prac;
/*
 * @author Abdsaleh
 */
public class Friend extends Person{
	private String hobby;
	
	public Friend(String name,int age, String hobby)
	{
		super(name,age);
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return super.toString() + "Friend{" + "hobby=" + hobby + '}';
	}
	
	public String chill()
	{
		return super.getName() + " is chilling";
	}
	
	public void play(Friend []friends)
	{
		int temp = friends.length;
		switch(temp)
		{
			case 0 -> {
				 System.out.println("playing " + hobby); 
			}
							
			case 1 -> {
				System.out.println("playing " + hobby + " with " + friends[0].getName());
			}
			
			case 2 -> { 
				System.out.println("playing " + hobby + " with " + friends[0].getName() + " and " + friends[1].getName());
			}
			
			default -> {
				if (temp > 2)
				{
					String friend = "";
					for(int a = 0 ;a < temp ; a++)
					{
						friend += friends[a].getName() + ",";
					}
					System.out.println("playing " + hobby + " with " + friend);
				}
			}
		}
//		return "";
	}
	
	public String getHobby()
	{
		return hobby;
	}
	
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	
	
	
}
