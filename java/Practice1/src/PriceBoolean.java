public class PriceBoolean {
    public static void main(String[] args) {
        int[] prices = {4500, 1000, 2000, 5000};
        int target = 2000;
        boolean found = false;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == target) {
                found = true;
            }
        }
        System.out.println(found);

    }
}
