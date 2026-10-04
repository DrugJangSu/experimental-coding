import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
                total += i;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}