package ObserverPattern;
/*
 * @author Abdsaleh
 */
public class CurrentConditionDisplay implements Observer{
	
	private float temp;
	private float humid;
	private float pressure;
	private WeatherData weather;
	
	@Override
	public void update(float temp, float humid, float pressure)
	{
		this.temp = temp;
		this.humid = humid;
		this.pressure = pressure;
		
		System.out.println("Values Updated");
	}
	
	public CurrentConditionDisplay(WeatherData weather)
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

	public float getPressure() {
		return pressure;
	}
	
	public void removeMe()
	{
		weather.removeObserver(this);
	}
	
}
