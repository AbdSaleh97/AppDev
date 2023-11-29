package practice;

public class Time
{
	int hours;
	int minutes;
	int seconds;
	
	public Time()
	{
		hours = 10;
		minutes = 30;
		seconds = 50;
	}
	public Time(int hours,int minutes,int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public void displayTime()
	{
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
