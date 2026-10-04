import java.util.Scanner;

public class for28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num > 0) {
                total1+= num;
            } else if (num < 0) {
                total2+= num;
            }
        }
        System.out.println(total1);
        System.out.println(total2);
    }
}
