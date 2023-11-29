package ObserverPattern.ObserverExample;
/*
 * @author Abdsaleh
 */
public class Abdelrahman implements Subscriber{
	
	private String name = this.getClass().getSimpleName();
	private MyYoutubeChannel sub1;
	
	public Abdelrahman(MyYoutubeChannel sub1)
	{
		this.sub1 = sub1;
		sub1.subscribe(this);
	}

	@Override
	public String toString() {
		return "Abdelrahman{" + "name=" + name + '}';
	}
	
	@Override
	public void newVideoMessage(String message){
		System.out.println(message);
	}
	
	public void unSubscribe()
	{
		sub1.unsubscribe(this);
	}

	public String getName()
	{
		return name;
	}
}
