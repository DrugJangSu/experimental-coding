import java.util.Scanner;

public class While7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (true) {
            String menu = sc.nextLine();
            if (menu.equals("americano")) {
                total += 4500;
            } else if (menu.equals("kimbap")) {
                total += 4000;
            } else if (menu.equals("water")) {
                total += 1000;
            } else if (menu.equals("done")) {
                break;
            } else {
                System.out.println("unknown");
            }

        }
        System.out.println("total=" + total);

    }
}
