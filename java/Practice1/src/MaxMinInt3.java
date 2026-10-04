import java.util.Scanner;

public class MaxMinInt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int max = Integer.parseInt(sc.nextLine());
        int position = 1;

        for (int i = 1; i <= (size - 1); i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num > max) {
                max = num;
                position = i + 1;
            }
        }
        System.out.println(position);

    }
}
