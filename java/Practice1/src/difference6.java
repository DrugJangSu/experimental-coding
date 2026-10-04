import java.util.Scanner;

public class difference6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = Integer.parseInt(sc.nextLine());
        int standard = Integer.parseInt(sc.nextLine());
        int limit = Integer.parseInt(sc.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            int difference = num - standard;
            if (difference < 0) {
                difference = difference * -1;
            }
            if (difference <= limit) {
                count++;
                total += num;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
