import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String menu = sc.nextLine();
            if (menu.equals("done")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
