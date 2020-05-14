package Car.Enums;

import Car.Car;

public enum Fuel {

    NINTY_FIVE("95-fuel"),
    NINTY_NINE("99-fuel"),
    ELECTRICITY("electricity");

    public String fuelType;

    Fuel(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

}
