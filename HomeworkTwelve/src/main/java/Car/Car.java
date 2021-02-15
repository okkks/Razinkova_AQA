package Car;

import Car.Interfaces.IEngine;

import java.util.Objects;

public class Car {

    public String color;
    public String model;
    public Integer yearOfProduction;
    public double engineCapacity;
    public Integer age;

    public IEngine engineType;


    public Car(String exactColor, String exactModel, Integer exactYearOfProduction, double exactEngineCapacity, IEngine engineType) {

        color = exactColor;
        model = exactModel;
        yearOfProduction = exactYearOfProduction;
        engineCapacity = exactEngineCapacity;
        age = 2020 - yearOfProduction;
        this.engineType = engineType;

    }

    public Car(){

    }

    void stop() {

        System.out.print("The" + color + model + "car is stopping");

    }

    void openDoors() {

        System.out.print("The doors are opening");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if ((yearOfProduction < 2021) && (yearOfProduction > 0)) {
            this.yearOfProduction = yearOfProduction;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {

        if ((engineCapacity > 0) && (engineCapacity < 10)) {
            this.engineCapacity = engineCapacity;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IEngine getEngineType() {
        return engineType;
    }

    public void setEngineType(int age) {
        this.engineType = engineType;
    }


    public void move() {
        engineType.move();
    }

    public int compareByAge(Car car) {

        int x;

        if (age == car.age) {
            x = 0;
        } else {
            if (age > car.age) {
                x = 1;
            } else {
                x = -1;
            }
        }
        return x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", age=" + age +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                Objects.equals(color, car.color) &&
                Objects.equals(model, car.model) &&
                Objects.equals(yearOfProduction, car.yearOfProduction) &&
                Objects.equals(age, car.age) &&
                Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, yearOfProduction, engineCapacity, age, engineType);
    }

}
