public class PriceSum {
    public static void main(String[] args) {
        int[] prices = {4500, 1000, 2000};
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        System.out.println(total);
    }
}
