import java.util.Scanner;

public class PriceLocation6 {
    public static void main(String[] args) {
        int[] prices = {1000, 4000, 5000, 2000};
        int count = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        int standard = Integer.parseInt(input.nextLine());

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= standard) {
                count++;
                total += prices[i];
            }
        }
        System.out.println("count = " + count);
        System.out.println("total = " + total);

    }
}
