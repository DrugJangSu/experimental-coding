public class GarageCheck {
    public static void main(String[] args) {
        Garage garageA = new Garage();
        Garage garageB = new Garage();

        Car car1 = new Car();
        car1.setInfo("12A", 2);
        Car car2 = new Car();
        car2.setInfo("34B", 5);
        Car car3 = new Car();
        car3.setInfo("56C", 1);

        garageA.addCar(car1);
        garageA.addCar(car2);
        garageB.addCar(car3);

        garageA.printAll();
        System.out.println("countA=" + garageA.countCars());
        garageB.printAll();
        System.out.println("countB=" + garageB.countCars());

    }
}
