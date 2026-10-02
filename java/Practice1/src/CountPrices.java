public class CountPrices {
    public static void main(String[] args) {
        int[] prices = {4500, 1000, 2000, 5000};
        int count = 0;
        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 4000 ) {
                count++;
                total+= prices[i];
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
