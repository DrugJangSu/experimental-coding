public class PriceLocation {
    public static void main(String[] args) {
        int[] prices = {4500, 1000, 2000, 5000};
        int target = 5000;
        int index = -1;

        for (int i=0; i < prices.length; i++) {
            if (prices[i] == target) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
