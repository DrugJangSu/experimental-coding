import java.util.HashMap;
import java.util.Scanner;

public class MapBasic2b {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("apple", 10);
        stock.put("banana", 0);
        stock.put("grape", 7);

        String input = sc.nextLine();
        if (stock.containsKey(input)) {
            System.out.println(input + " stock=" + stock.get(input));
        } else {
            System.out.println("no frult");
        }


    }
}
