import java.util.Scanner;

public class for19 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int total = 0;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(input.nextLine());
            if (n > 0) {
                total += n;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
