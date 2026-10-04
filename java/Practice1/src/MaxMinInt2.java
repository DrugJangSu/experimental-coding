import java.util.Scanner;

public class MaxMinInt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int max = Integer.parseInt(sc.nextLine());
        int min = max;

        for (int i = 1; i <= (size - 1); i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max - min);
    }
}
