package cs2901.utec.edu.pe;

public class WeatherData implements Subject {
    private double Temperature, Humity, Pressure;
    int size = 0;
    @Override


    public void registerObserver(Observer observer, int i)
    {
        observers[i] = observer;
        size++;
    };
    public void removeObserver()
    {

    };
    public void notifyObservers()
    {
        for (int i = 0; i < size; i ++)
        {
            observers[i].update();
        }
    };

    double getTemperature()
    {
        return Temperature;
    };
    double getHumity ()
    {
        return Humity;
    }
    double getPressure ()
    {
        return Pressure;
    }
    void measurementsChanged()
    {
        Temperature = (Math.random()%100 + 10);
        Humity = (Math.random()%100 + 10);
        Pressure = (Math.random()%100 + 10);
        notifyObservers();
    }
}
