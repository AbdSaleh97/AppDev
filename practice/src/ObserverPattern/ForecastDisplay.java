package ObserverPattern;
/*
 * @author Abdsaleh
 */
public class ForecastDisplay implements Observer{
	
	private float temp;
	private float pressure;
	private float humid;
	private WeatherData weather;
	
	public ForecastDisplay(WeatherData weather)
	{
		this.weather = weather;
		weather.registerObserver(this);
	}
	@Override
	public void update(float temp, float humid, float pressure)
	{
		this.temp = temp;
		this.humid = humid;
		this.pressure = pressure;
		
		System.out.println("Update");
	}
	
	public void removeMe()
	{
		weather.removeObserver(this);
	}

	public float getTemp() {
		return temp;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumid() {
		return humid;
	}
	
}
