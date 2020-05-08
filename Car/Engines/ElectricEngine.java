package Car.Engines;

import Car.Enums.Fuel;
import Car.Interfaces.IEngine;

public class ElectricEngine implements IEngine {

    private Fuel fuelType;

    public ElectricEngine(Fuel fuelType) {
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

        if (fuelType == Fuel.ELECTRICITY) {
            System.out.println("The car is moving on electricity.");
        } else {
            System.out.println("The petrol doesn't fit. Please use an electricity.");
        }
    }
    @Override
    public String toString() {
        return "Electric Engine";
    }
}
