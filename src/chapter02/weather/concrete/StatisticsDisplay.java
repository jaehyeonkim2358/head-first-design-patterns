package concrete;

import interfaces.DisplayElement;
import interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update() {
		float temp = weatherData.getTemperature();
		this.tempSum += temp;
		this.numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("평균/최고/최저 온도 = " + (this.tempSum / this.numReadings)
			+ "/" + this.maxTemp + "/" + this.minTemp);
	}
}
