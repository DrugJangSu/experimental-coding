import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            int input = Integer.parseInt(sc.nextLine());
            if (input == 0) {
                break;
            }
            total += input;
            count++;
        }
        System.out.println(count);
        System.out.println(total);
    }
}
