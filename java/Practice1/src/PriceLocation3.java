public class PriceLocation3 {
    public static void main(String[] args) {
        int[] prices = {1000, 2000, 3999};
        int index = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 4000) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("missing");
        }

    }
}
