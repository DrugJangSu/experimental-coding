import java.util.Scanner;

public class continue3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num =  Integer.parseInt(input.nextLine());
            if (num == -1) {
                break;
            } else if (num < 0) {
                continue;
            } else {
                count++;
                total += num;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }

}
