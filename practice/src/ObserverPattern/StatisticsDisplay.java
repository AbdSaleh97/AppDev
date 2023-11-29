package ObserverPattern;
/*
 * @author Abdsaleh
 */
public class StatisticsDisplay implements Observer{
	private float temp;
	private float humid;
	private float pressuer;
	private WeatherData weather;
	
	@Override
	public void update(float temp,float pressure, float humid)
	{
		this.temp = temp;
		this.humid = humid;
		this.pressuer = pressure;
		
		System.out.println("Values are upated");
	}
	
	public StatisticsDisplay(WeatherData weather)
	{
		this.weather = weather;
		weather.registerObserver(this);
	}

	public float getTemp() {
		return temp;
	}

	public float getHumid() {
		return humid;
	}

	public float getPressuer() {
		return pressuer;
	}
	
	public void removeMe()
	{
		weather.removeObserver(this);
	}
	
}
