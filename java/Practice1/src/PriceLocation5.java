import java.util.Scanner;

public class PriceLocation5 {
    public static void main(String[] args) {
        int[] prices = {1000, 4000, 5000, 2000};
        int index = -1;

        Scanner input = new Scanner(System.in);

        int standard = Integer.parseInt(input.nextLine());

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= standard) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("missing");
        } else {
            System.out.println("index = " + index);
        }

    }
}
