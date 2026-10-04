import java.util.Scanner;

public class PriceLocation8 {

    public static void main(String[] args) {
        int[] prices = new int[4];
        int count = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(input.nextLine());
        }
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
