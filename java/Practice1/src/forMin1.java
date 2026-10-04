import java.util.Scanner;

public class forMin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());
        System.out.println(min);

        for (int i = 1; i <= (size-1); i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num < min) {
                min = num;
            }
            System.out.println(min);
        }
    }
}
