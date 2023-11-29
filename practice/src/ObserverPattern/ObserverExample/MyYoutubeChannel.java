package ObserverPattern.ObserverExample;

import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class MyYoutubeChannel implements Subject{
	private ArrayList<Subscriber> listOfsub = new ArrayList<>();
	private String notifiyMessage;
	
	
	public ArrayList<Subscriber> getListOfSub()
	{
		return listOfsub;
	}
	
	@Override
	public void subscribe(Subscriber sub)
	{
		listOfsub.add(sub);
	}
	
	@Override
	public void unsubscribe(Subscriber sub)
	{
		if (listOfsub.contains(sub))
		{
			listOfsub.remove(sub);
		}
		else	
			System.out.println("The person is not subscribed in the channel.");
	}
	
	@Override
	public void notifiy()
	{
		int i = 0;
		notifiyMessage = "Hello " + listOfsub.get(i).getClass().getSimpleName() + " a new video has been uploaded";
		for (; i < listOfsub.size(); i++) 
		{
			listOfsub.get(i).newVideoMessage(notifiyMessage);
			i++;
		}
	}	
}
