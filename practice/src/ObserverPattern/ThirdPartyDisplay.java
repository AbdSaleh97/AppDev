package ObserverPattern;
/*
 * @author Abdsaleh
 */
public class ThirdPartyDisplay implements Observer{
	
	float temp;
	float pressure;
	
	private WeatherData weather;
	
	public ThirdPartyDisplay(WeatherData weath)
	{
		this.weather = weath;
		weather.registerObserver(this);

	}
	
	@Override
	public void update(float temp,float humid ,float pressure)
	{
		this.temp = temp;
		this. pressure = pressure;
		
		System.out.println("Values are updated");
	}
	
	public void removeMe()
	{
		weather.removeObserver(this);
	}
	
}
