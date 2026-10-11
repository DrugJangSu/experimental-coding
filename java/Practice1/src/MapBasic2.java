import java.util.HashMap;
import java.util.Scanner;

public class MapBasic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("coffee", 3500);
        prices.put("tea", 2500);
        prices.put("juice", 4000);

        String input = sc.nextLine();
        if (prices.containsKey(input)) {
            System.out.println(input + "=" + prices.get(input));
        } else {
            System.out.println("not found");
        }
    }
}
