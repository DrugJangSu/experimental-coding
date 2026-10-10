import java.util.ArrayList;

public class SnackListCheck {
    public static void main(String[] args) {
        int total = 0;

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

        ArrayList<Snack> snacks =  new ArrayList<>();
        snacks.add(s1);
        snacks.add(s2);
        snacks.add(s3);

        for (int i = 0; i < snacks.size(); i++) {
            int value = snacks.get(i).stockValue();
            System.out.println(snacks.get(i).name + "=" + value);
            total += value;

        }
        System.out.println("total=" + total);
        System.out.println("count=" + snacks.size());
    }

}
