package CarPackage;

import java.util.ArrayList;

public class CarList {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car();
        car1.color = "white";
        cars.add(car1);

        Car car2 = new Car();
        car2.color = "black";
        cars.add(car2);

        System.out.println("size=" + cars.size());
        for (int i = 0; i < cars.size(); i++) {
            Car c = cars.get(i);
            System.out.println(i + "=" + c.color);
        }

        Car first = cars.get(0);
        first.color = "red";
        System.out.println("car1=" + car1.color);

        for (int i = 0; i < cars.size(); i++) {
            Car c = cars.get(i);
            c.print();
        }

    }
}
