package ObserverPattern;
/*
 * @author Abdsaleh
 */
public interface Subject {	
	public void registerObserver(Observer obser);
	public void removeObserver(Observer obser);
	public void notifiyObserver();
	
	
	
}
