
package Car;

import Car.comparators.YearComparator;

import java.util.ArrayList;
import java.util.HashMap;

public class CarArray {

    private ArrayList<Car> carArray = new ArrayList<>();


    public ArrayList<Car> getCarArray() {
        return carArray;
    }

    public void add(Car car) {
        carArray.add(car);
    }

    public ArrayList<Car> sortByAge() {
        ArrayList<Car> sortedCars = carArray;
        sortedCars.sort(new YearComparator());
        return sortedCars;
    }

    public ArrayList<Car> getNewCars(int numberOfNewCars) {
        ArrayList<Car> newCars = new ArrayList<>();
        for (int i = 0; i < carArray.size(); i++) {
            newCars.add(i, carArray.get(i));
        }
        newCars.sort(new YearComparator());
        newCars.subList(0, newCars.size() - numberOfNewCars).clear();
        return newCars;
    }

    public ArrayList<Car> getCarsByColor(String color) {
        ArrayList<Car> sameColorCars = new ArrayList<>();
        for (Car car : carArray) {
            if (car.color.equals(color)) {
                sameColorCars.add(car);
            }
        }
        return sameColorCars;
    }

    public HashMap<String, Integer> getColorStat() {
        HashMap<String, Integer> statisticMap = new HashMap<>();
        for (Car car : carArray) {
            if (!statisticMap.containsKey(car.getColor())) {
                statisticMap.put(car.getColor(), 1);
            } else {
                statisticMap.put(car.getColor(), statisticMap.get(car.getColor()) + 1);
            }
        }
        return statisticMap;
    }

    public ArrayList<Car> getUniqueCars() {
        ArrayList<Car> uniqueCars = carArray;
        for (int i = 0; i < carArray.size() - 1; i++) {
            if (carArray.get(i).equals(carArray.get(i + 1))) {
                carArray.remove(i);
            }
        }
        return uniqueCars;
    }

    public static void printCarsInfo(ArrayList<Car> cars) {
        String s = "\nCarArray: ";
        for (int i = 0; i < cars.size(); i++) {
            s += "\n" + i +
                    ": model = '" + cars.get(i).model + '\'' +
                    ", color = '" + cars.get(i).color + '\'' +
                    ", engineType = " + cars.get(i).engineType.toString() +
                    ", yearOfProduction = " + cars.get(i).yearOfProduction +
                    ", carAge = " + cars.get(i).age;
        }
        System.out.println(s);
    }

    public static int size() {
        return size();
    }


}

