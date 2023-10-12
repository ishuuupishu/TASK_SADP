interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

interface Observer {
    void update(int temperature);
}

class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: Temperature is now " + temperature + "°C");
    }
}

class Fan implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature > 25) {
            System.out.println("Fan: It's getting hot! Turning on the fan.");
        } else {
            System.out.println("Fan: It's cool. Turning off the fan.");
        }
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer temperatureDisplay = new TemperatureDisplay();
        Observer fan = new Fan();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(fan);

        weatherStation.setTemperature(20);
        weatherStation.setTemperature(30);

        weatherStation.removeObserver(temperatureDisplay);
        weatherStation.setTemperature(18);
    }
}
