import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
