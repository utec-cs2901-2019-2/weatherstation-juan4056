package cs2901.utec.edu.pe;

public class StatisticsDisplay implements Observer {

    private double Temperature = 0, Humity = 0, Pressure = 0;
    private double minTemperature = 10000, minHumity = 10000, minPressure = 10000;
    private double maxTemperature = 0, maxHumity = 0, maxPressure = 0;
    private int times = 0;
    private WeatherData subject = new WeatherData();
    public StatisticsDisplay (WeatherData weatherData){
        subject = weatherData;
    }
    @Override
    public void update() {
        Temperature = (Temperature * times) + subject.getTemperature();
        Humity = (Humity * times) + subject.getHumity();
        Pressure = (Pressure * times) + subject.getPressure();
        times += 1;
        Temperature = Temperature / times;
        Humity = Humity / times;
        Pressure = Pressure / times;
        if (minTemperature > subject.getTemperature())
            minTemperature = subject.getTemperature();
        if (maxTemperature < subject.getTemperature())
            maxTemperature = subject.getTemperature();

        if (minHumity > subject.getHumity())
            minHumity = subject.getHumity();
        if (maxHumity < subject.getHumity())
            maxHumity = subject.getHumity();

        if (minPressure > subject.getPressure())
            minPressure = subject.getPressure();
        if (maxPressure < subject.getPressure())
            maxPressure = subject.getPressure();
    }

    public void display() {
        System.out.printf("\nAverage Temperature: %f Min: %f Max: %f\n", Temperature, minTemperature, maxTemperature);
        System.out.printf("\nAverage Humity: %f Min: %f Max: %f\n", Humity, minHumity, maxHumity);
        System.out.printf("\nAverage Pressure: %f Min: %f Max: %f\n", Pressure, minPressure, maxPressure);
    }
}
