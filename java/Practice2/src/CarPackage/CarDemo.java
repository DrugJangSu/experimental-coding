package CarPackage;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";

        Car car2 = new Car();
        car2.color = "black";

        System.out.println("car1=" + car1.color);
        System.out.println("car2=" + car2.color);

        car1.color = "red";
        System.out.println("after car1=" + car1.color);
        System.out.println("after car2=" + car2.color);

    }
}
