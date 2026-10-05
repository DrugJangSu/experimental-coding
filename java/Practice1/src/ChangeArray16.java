import java.util.Scanner;

public class ChangeArray16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int [3];
        int [] b = new int [3];
        int [] sum = new int [3];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
