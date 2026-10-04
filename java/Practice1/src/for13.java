import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
