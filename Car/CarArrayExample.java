package Car;

import Car.Engines.ElectricEngine;
import Car.Engines.PetrolEngine;
import Car.Enums.Fuel;
import Car.Interfaces.IEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class CarArrayExample {

    public static void main(String[] args) {

        IEngine petrolEngine = new PetrolEngine(Fuel.NINTY_FIVE);
        IEngine electricEngine = new ElectricEngine(Fuel.ELECTRICITY);

        Car car1 = new Car("black", "mazda", 2018, 2.6, petrolEngine);
        Car car2 = new Car("red", "ferrari", 2001, 3.4, electricEngine);
        Car car3 = new Car("red", "opel", 1998, 1.2, petrolEngine);
        Car car4 = new Car("blue", "ferrari", 2010, 2.2, electricEngine);
        Car car5 = new Car("red", "bmw", 2019, 2.2, petrolEngine);
        Car car6 = new Car("red", "bmw", 2019, 2.2, petrolEngine);
        Car car7 = new Car("red", "ferrari", 2001, 3.4, electricEngine);

        CarArray carList = new CarArray();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);

        System.out.println("Сортировка машин по возрасту:");

        CarArray.printCarsInfo(carList.sortByAge());

        System.out.println("\n\nСортировка машин по цвету:");

        ArrayList<Car> redCars = new ArrayList<>(carList.getCarsByColor("red"));

        CarArray.printCarsInfo(redCars);

        System.out.println("\nВывод всей информации о машиних из массива:");

        CarArray.printCarsInfo(carList.getCarArray());

        System.out.println("\nВызов метода move() интерфейса Engine:");

        car1.move();
        car2.move();

        System.out.println("\nВывожу массив с заданым количеством новых машин:");

        ArrayList<Car> newCarsArray = new ArrayList<>(carList.getNewCars(4));

        CarArray.printCarsInfo(newCarsArray);

        System.out.println("\nВывожу массив уникальных машин:");

        ArrayList<Car> uniqueCars = new ArrayList<>(carList.getUniqueCars());

        CarArray.printCarsInfo(uniqueCars);

        System.out.println("\nВывожу статистику по машинам с одинаковым цветом:");

        HashMap<String, Integer> colorStat = new HashMap(carList.getColorStat());

        System.out.println(colorStat);

    }

}


