import java.util.HashMap;
import java.util.Scanner;

public class StockCheck1 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        stock.put("apple", 5);
        stock.put("milk", 0);
        stock.put("bread", 3);

        System.out.println("input the product name");
        String product = sc.next();
        if (stock.containsKey(product)) {
            if (stock.get(product) == 0) {
                System.out.println("sold out");
            } else {
                System.out.println("stock=" + stock.get(product));
            }
        } else {
            System.out.println("unknown");
        }

    }
}
