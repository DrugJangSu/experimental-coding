import java.util.ArrayList;
import java.util.Scanner;

public class RoomCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room r1 = new Room();
        r1.name = "deluxe";
        r1.price = 80000;
        r1.fee = 15000;

        Room r2 = new Room();
        r2.name = "standard";
        r2.price = 50000;
        r2.fee = 10000;


        Room r3 = new Room();
        r3.name = "suite";
        r3.price = 120000;
        r3.fee = 20000;

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        System.out.println("Input the number of days.");
        int days = Integer.parseInt(sc.nextLine());
        System.out.println("What is your budget?");
        int budget = Integer.parseInt(sc.nextLine());
        int ok = 0;
        int cheapPrice = rooms.get(0).stay(days);
        String cheapName = rooms.get(0).name;

        for (int i = 0; i < rooms.size(); i++) {
            int fullPrice = rooms.get(i).stay(days);
            System.out.println(rooms.get(i).name + "=" + fullPrice);
            if (budget >= fullPrice) {
                ok++;
            }
            if (fullPrice < cheapPrice) {
                cheapPrice = fullPrice;
                cheapName = rooms.get(i).name;
            }
        }
        System.out.println("ok=" + ok);
        System.out.println("cheap=" + cheapName);

    }
}
