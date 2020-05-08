package Car.Engines;

import Car.Enums.Fuel;
import Car.Interfaces.IEngine;

public class PetrolEngine implements IEngine {

    private Fuel fuelType;

    public PetrolEngine(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    @Override
    public void move() {

        switch (fuelType) {
            case NINTY_FIVE:
                System.out.println("Car is moving on 95th petrol");
                break;
            case NINTY_NINE:
                System.out.println("Car is moving on 99th petrol");
                break;
            default:
                System.out.println("The petrol doesn't fit");
                break;
        }
    }

    @Override
    public String toString() {
        return "Petrol Engine";
    }
}
