public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMesurement(80,65,30.4f);
        weatherData.setMesurement(85,40,40.2f);
        weatherData.setMesurement(85,30,30.2f);
    }
}
