import java.util.Scanner;

public class for30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int count = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0) {
                count++;
            }
            System.out.println(count);
        }
    }
}
