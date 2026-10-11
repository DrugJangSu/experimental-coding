import java.util.ArrayList;

public class Garage {

    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car) {
        cars.add(car);
    }

    void printAll() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).printInfo();
        }
    }

    void countCars() {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i);
            count++;
        }
        System.out.println(count);
    }

}
