package cs2901.utec.edu.pe;

public class ThirdPartyDisplay implements Observer {
    private double Temperature, Humidity, Pressure;
    private WeatherData subject;
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
