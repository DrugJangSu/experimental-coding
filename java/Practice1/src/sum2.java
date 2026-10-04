import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num < 0) {
                num = num * (-1);
            }
            total += num;
        }
        System.out.println(total);
    }
}
