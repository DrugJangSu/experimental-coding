import java.util.HashMap;
import java.util.Scanner;

public class While9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("apple", 1200);
        menu.put("banana", 800);
        menu.put("milk", 2500);
        int sum = 0;

        while (true) {
            String product = sc.nextLine();
            if (product.equals("end")) {
                break;
            } else if (menu.containsKey(product)) {
                sum += menu.get(product);
            } else {
                System.out.println("none");
            }
        }
        System.out.println("sum=" + sum);
    }
}
