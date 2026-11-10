package CarPackage;

public class Car {
    String color;
    String number;

    public void print() {
        System.out.println(color + " " + number);
    }

    public void paint(String newColor) {
        color = newColor;
    }

}
