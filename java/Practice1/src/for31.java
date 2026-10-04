import java.util.Scanner;

public class for31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num > 0) {
                total += num;
            }
            System.out.println(total);
        }
    }
}
