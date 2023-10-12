class Engine {
    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }
}

class FuelInjector {
    public void injectFuel() {
        System.out.println("Fuel injected");
    }

    public void stopInjection() {
        System.out.println("Fuel injection stopped");
    }
}

class IgnitionSystem {
    public void ignite() {
        System.out.println("Ignition system ignited");
    }

    public void turnOff() {
        System.out.println("Ignition system turned off");
    }
}

class VehicleFacade {
    private Engine engine;
    private FuelInjector fuelInjector;
    private IgnitionSystem ignitionSystem;

    public VehicleFacade() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        ignitionSystem = new IgnitionSystem();
    }

    public void startVehicle() {
        System.out.println("Starting the vehicle");
        engine.start();
        fuelInjector.injectFuel();
        ignitionSystem.ignite();
        System.out.println("Vehicle started");
    }

    public void stopVehicle() {
        System.out.println("Stopping the vehicle");
        ignitionSystem.turnOff();
        fuelInjector.stopInjection();
        engine.stop();
        System.out.println("Vehicle stopped");
    }
}

public class FacadePatternExample {
    public static void main(String[] args) {
        VehicleFacade vehicleFacade = new VehicleFacade();

        vehicleFacade.startVehicle();
        System.out.println();

        vehicleFacade.stopVehicle();
    }
}
