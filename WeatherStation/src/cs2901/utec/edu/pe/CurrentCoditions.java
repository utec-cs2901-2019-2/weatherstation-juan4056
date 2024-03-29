package cs2901.utec.edu.pe;

public class CurrentCoditions implements Observer {
    private double Temperature, Humidity, Pressure;
    private WeatherData subject;

    public CurrentCoditions (WeatherData weatherData){
        subject = weatherData;
    }

    @Override
    public void update() {
        Temperature = subject.getTemperature();
        Humidity = subject.getHumity();
        Pressure = subject.getPressure();
    }

    public void display() {
        System.out.printf("\nTemperature: %f", Temperature);
        System.out.printf("\nHumity: %f", Humidity);
        System.out.printf("\nPressure: %f", Pressure);
    }
}
