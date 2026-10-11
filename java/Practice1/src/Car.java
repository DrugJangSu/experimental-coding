public class Car {
    String number;
    int hours;

    void setInfo(String pNumber, int pHours) {
        number = pNumber;
        hours = pHours;
    }

    void printInfo() {
        System.out.println(number + " " + hours);
    }

}
