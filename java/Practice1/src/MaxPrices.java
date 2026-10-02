public class MaxPrices {
    public static void main(String[] args) {
        int[]prices = {4500, 1000, 2000, 5000};
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println(max);
    }
}
