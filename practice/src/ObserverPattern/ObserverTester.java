package ObserverPattern;

/*
 * @author Abdsaleh
 */
public class ObserverTester {
	public static void main(String []args)
	{
		WeatherData weath = new WeatherData();

		weath.setMeasurment(23.4f,114.5f,124.2f);
		Observer s = new ThirdPartyDisplay(weath);
		weath.registerObserver(s);
		s.update(1, 2, 3);
		
		System.out.println(s);
	}
	
}
