package concrete;

import interfaces.DisplayElement;
import interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.display();
    }

    public void display() {
        System.out.println("현재 상태: 온도 "+this.temperature+ "F, 습도 "+this.humidity+"%");
    }
}
