import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
