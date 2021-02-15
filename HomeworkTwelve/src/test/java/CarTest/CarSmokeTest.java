package CarTest;

import Car.Car;
import Car.CarArray;
import Car.Engines.ElectricEngine;
import Car.Engines.PetrolEngine;
import Car.Enums.Fuel;
import Car.Interfaces.IEngine;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;

public class CarSmokeTest extends CarArray {

    private CarArray carArray = new CarArray();

    IEngine petrolEngine = new PetrolEngine(Fuel.NINTY_FIVE);
    IEngine electricEngine = new ElectricEngine(Fuel.ELECTRICITY);


    Car car1 = new Car("black", "mazda", 2018, 2.6, petrolEngine);
    Car car2 = new Car("red", "ferrari", 2001, 3.4, electricEngine);
    Car car3 = new Car("red", "opel", 2011, 1.2, petrolEngine);
    Car car4 = new Car("blue", "ferrari", 2010, 2.2, electricEngine);
    Car car5 = new Car("blue", "ferrari", 2010, 2.2, electricEngine);


    @BeforeSuite(enabled = true, groups = "CarArrayTest")
    public void setUpCarArray() {

        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car3);
        carArray.add(car4);
        carArray.add(car5);

    }

    @Test(enabled = true, groups = "CarArrayTest")
    public void testSortByAge() throws Exception {

        ArrayList<Car> sortedByAge = new ArrayList<>(carArray.sortByAge());

        System.out.println("Array sorted by age:");
        CarArray.printCarsInfo(sortedByAge);

        assertThat(sortedByAge.get(0), Matchers.equalTo(car2));

    }

    @Test(enabled = true, groups = "CarArrayTest")
    public void testGetUniqueCars() throws Exception {

        ArrayList<Car> uniqueCars = new ArrayList<>(carArray.getUniqueCars());

        System.out.println("Array with unique cars:");
        CarArray.printCarsInfo(uniqueCars);

        assertThat(uniqueCars.size(), Matchers.equalTo(4));

    }

    @Test(enabled = true, groups = "CarArrayTest")
    public void testNewCars() throws Exception {

        ArrayList<Car> newCars = new ArrayList<>(carArray.getNewCars(1));

        System.out.println("Array with one the newest car:");
        CarArray.printCarsInfo(newCars);

        assertThat(newCars.get(0), Matchers.equalTo(car1));

    }

    @Test(enabled = true, groups = "CarArrayTest")
    public void testColorStat() throws Exception {

        HashMap<String, Integer> colorStat = new HashMap(carArray.getColorStat());

        System.out.println("HashMap with statistic of cars by colors:");
        System.out.println(colorStat);

        assertThat(colorStat.get("black"), Matchers.equalTo(1));

    }

    @Test(enabled = true, groups = "CarArrayTest")
    public void testGetCarsByColor() throws Exception {

        ArrayList<Car> blackCars = new ArrayList<>(carArray.getCarsByColor("black"));

        System.out.println("Array with black cars:");
        CarArray.printCarsInfo(blackCars);

        assertThat(blackCars.get(0), Matchers.equalTo(car1));

    }
}

