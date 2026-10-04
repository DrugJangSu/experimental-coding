import java.util.Scanner;

public class for17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(input.nextLine());
            total += n;
        }
        System.out.println(total);
    }
}
