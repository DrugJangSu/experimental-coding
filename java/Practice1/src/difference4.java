import java.util.Scanner;

public class difference4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = Integer.parseInt(sc.nextLine());
        int standard = Integer.parseInt(sc.nextLine());
        int limit = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            int difference = num - standard;
            if (difference < 0) {
                difference = difference * -1;
            }
            if (difference <= limit) {
                System.out.println("near");
            } else {
                System.out.println("far");
            }
        }
    }
}
