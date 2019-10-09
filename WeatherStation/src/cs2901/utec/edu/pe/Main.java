package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();
        CurrentCoditions currentCoditions = new CurrentCoditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.registerObserver(currentCoditions, 0);
        weatherData.registerObserver(statisticsDisplay, 1);

        weatherData.measurementsChanged();
        currentCoditions.display();
        statisticsDisplay.display();

        weatherData.measurementsChanged();
        currentCoditions.display();
        statisticsDisplay.display();

        weatherData.measurementsChanged();
        currentCoditions.display();
        statisticsDisplay.display();

    }
}
