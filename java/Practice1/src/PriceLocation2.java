public class PriceLocation2 {
    public static void main(String[] args) {
        int[] prices = {1000, 2000, 4500, 5000};
        int index = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 4000) {
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
