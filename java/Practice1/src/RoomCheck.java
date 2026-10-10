public class RoomCheck {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.name = "standard";
        room1.price = 50000;
        room1.fee = 10000;

        Room room2 = new Room();
        room2.name = "suite";
        room2.price = 120000;
        room2.fee = 20000;

        System.out.println("standard=" + room1.basic());
        System.out.println("suite=" + room2.basic());
        System.out.println("stay=" + room1.stay(3));
        System.out.println("total=" + total(room1.basic(), room2.basic()));
    }

    public static int total(int number1, int number2) {
        return number1 + number2;
    }
}
