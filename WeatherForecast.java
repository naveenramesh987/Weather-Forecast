public class WeatherForecast {
    private Location location;
    private WeatherData currentWeather;

    public WeatherForecast(Location location) {
        this.location = location;
    }

    public void getWeatherData() {
        int temperature = (int) Math.round(Math.random() * 100);
        int humidity = (int) Math.floor(Math.random() * 101);
        int windSpeed = (int) Math.floor(Math.random() * 61);
        currentWeather = new WeatherData(temperature, humidity, windSpeed);
    }

    public void displayWeather() {
        if (currentWeather == null) {
            System.out.println("No weather data available");
            return;
        }
        System.out.println("Weather forecast for " + location.getName() + ":");
        System.out.println("Temperature: " + currentWeather.getTemperature() + "°F");
        System.out.println("Humidity: " + currentWeather.getHumidity() + "%");
        System.out.println("Wind speed: " + currentWeather.getWindSpeed() + " km/h");
    }
}