public class WeatherData {
    private int temperature;
    private int humidity;
    private int windSpeed;

    public WeatherData(int temperature, int humidity, int windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }
}