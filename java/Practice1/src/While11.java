import java.util.HashMap;
import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("americano", 4500);
        menu.put("kimbap", 4000);
        menu.put("water", 1000);

        int total = 0;

        while (true) {
            System.out.print("menu?\n");
            String product = sc.next();
            if (product.equals("done")) {
                break;
            } else if (menu.containsKey(product)) {
                System.out.println("qty?");
                int qty = Integer.parseInt(sc.next());
                int line = qty * menu.get(product);
                System.out.println("line=" + line);
                total += line;
            } else {
                System.out.println("unknown");
            }
        }
        System.out.println("total=" + total);
        System.out.println("pay?");
        int pay = Integer.parseInt(sc.next());
        if (pay >= total) {
            int change = pay - total;
            System.out.println("change=" + change);
        } else {
            System.out.println("short");
        }
    }

}

