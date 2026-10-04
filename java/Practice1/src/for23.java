import java.util.Scanner;

public class for23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0) {
                count++;
                total += num;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
