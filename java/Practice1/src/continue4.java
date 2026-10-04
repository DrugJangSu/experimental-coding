import java.util.Scanner;

public class continue4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num == 0) {
                break;
            }
            if (num % 2 != 0) {
                continue;
            } else {
                count++;
                total += num;
            }
        }
        if (count == 0) {
            System.out.println("missing");
        } else {
            System.out.println(count);
            System.out.println(total);
        }

    }
}
