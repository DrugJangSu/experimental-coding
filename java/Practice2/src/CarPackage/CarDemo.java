package CarPackage;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";
        car1.number = "12ga3456";

        Car car2 = new Car();
        car2.color = "black";
        car2.number = "34na5678";

        car1.print();
        car2.print();

//        System.out.println("car1=" + car1.color);
//        System.out.println("car2=" + car2.color);
//
//        car1.color = "red";
//        System.out.println("after car1=" + car1.color);
//        System.out.println("after car2=" + car2.color);

    }
}
