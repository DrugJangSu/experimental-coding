import java.util.HashMap;
import java.util.Scanner;

public class While8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("americano", 4500);
        menu.put("kimbap", 4000);
        menu.put("water", 1000);

        int total = 0;
        while (true) {
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            } else if (menu.containsKey(input)) {
                total += menu.get(input);
            } else {
                System.out.println("unknown");
            }
        }
        System.out.println("total=" + total);


    }
}
