import java.util.HashMap;
import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> menu = new HashMap<>();
        int sum = 0;

        menu.put("apple", 1200);
        menu.put("banana", 800);
        menu.put("milk", 2500);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            } else if (menu.containsKey(input)) {
                int num = Integer.parseInt(sc.nextLine());
                int line =num * menu.get(input);
                System.out.println("line=" + line);
                sum += line;
            } else {
                System.out.println("none");
            }
        }
        System.out.println("sum=" + sum);
    }

}
