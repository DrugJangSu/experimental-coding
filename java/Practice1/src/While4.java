import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            total += input;
        }
        System.out.println(total);

    }
}
