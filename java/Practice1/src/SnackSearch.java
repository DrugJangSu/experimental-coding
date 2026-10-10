import java.util.ArrayList;
import java.util.Scanner;

public class SnackSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snack s1 = new Snack();
        s1.name = "chips";
        s1.price = 1500;
        s1.stock = 10;

        Snack s2 = new Snack();
        s2.name = "cola";
        s2.price = 2000;
        s2.stock = 5;

        Snack s3 = new Snack();
        s3.name = "candy";
        s3.price = 500;
        s3.stock = 20;

        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(s1);
        snacks.add(s2);
        snacks.add(s3);

        String nameInput = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < snacks.size(); i++) {
            if (snacks.get(i).name.equals(nameInput)) {
                System.out.println(snacks.get(i).name + "=" + snacks.get(i).stockValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }


}
