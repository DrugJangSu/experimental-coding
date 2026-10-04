import java.util.Scanner;

public class for18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(input.nextLine());
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
