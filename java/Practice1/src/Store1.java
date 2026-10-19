import java.util.HashMap;
import java.util.Scanner;

public class Store1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> category = new HashMap<>();
        category.put("apple", 1200);
        category.put("milk", 2500);
        category.put("bread", 1800);

        int total = 0;
        while (true) {
            System.out.println("input product");
            String product = sc.next();
            if (product.equals("end")) {
                break;
            } else if (category.containsKey(product)) {
                System.out.println("how many?");
                int qty = sc.nextInt();
                if (qty <= 0) {
                    System.out.println("invalid");
                    continue;
                }
                total += category.get(product) * qty;
            } else {
                System.out.println("unknown");
            }
        }
        System.out.println("total=" + total);
        System.out.println("pay?");
        int pay = sc.nextInt();
        if (pay >= total) {
            int change = pay - total;
            System.out.println("change=" + change);
        } else {
            System.out.println("short");
        }



    }
}
