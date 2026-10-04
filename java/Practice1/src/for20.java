import java.util.Scanner;

public class for20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int total = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(input.nextLine());
            if (n >= 10) {
                total += n;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
