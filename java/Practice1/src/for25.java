import java.util.Scanner;

public class for25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int standard = Integer.parseInt(input.nextLine());
        int total = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num >= standard && num % 2 == 0) {
                total += num;
                count++;
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
