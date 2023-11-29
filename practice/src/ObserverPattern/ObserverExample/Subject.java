package ObserverPattern.ObserverExample;

/*
 * @author Abdsaleh
 */
public interface Subject {
	public void subscribe(Subscriber sub);
	public void unsubscribe(Subscriber sub);
	public void notifiy();	
}
