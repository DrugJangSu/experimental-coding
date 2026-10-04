import java.util.Scanner;

public class for3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);
        }
}


