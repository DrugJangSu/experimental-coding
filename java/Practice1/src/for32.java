import java.util.Scanner;

public class for32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int total = 0;
        int count = 0;
        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num == -1) {
                break;
            }
                total += num;
                count++;
        }
        System.out.println(count);
        System.out.println(total);
    }
}
