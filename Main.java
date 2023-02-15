public class Main {
    public static void main(String[] args) {
        Location location = new Location("location");
        WeatherForecast weatherForecast = new WeatherForecast(location);
        weatherForecast.getWeatherData();
        weatherForecast.displayWeather();
    }
}