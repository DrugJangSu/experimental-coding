import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        if (n > 0) {
            System.out.println(n);
        } else if (n < 0) {
            System.out.println((n * (-1)));
        } else {
            System.out.println(0);
        }
    }
}
