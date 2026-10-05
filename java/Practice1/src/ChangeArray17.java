import java.util.Scanner;

public class ChangeArray17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        int [] b = new int[3];
        int [] bigger = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] >= b[i]) {
                bigger[i]  = a[i];
            } else {
                bigger[i] = b[i];
            }
            System.out.println(bigger[i]);
        }
    }
}
