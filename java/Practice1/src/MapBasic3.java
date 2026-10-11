import java.util.HashMap;
import java.util.Scanner;

public class MapBasic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "kim");
        names.put(2, "lee");
        names.put(3, "park");

        int inputNumber = Integer.parseInt(sc.nextLine());
        if (names.containsKey(inputNumber)) {
            System.out.println(inputNumber + "=" + names.get(inputNumber));
        } else {
            System.out.println("not found");
        }

    }
}
