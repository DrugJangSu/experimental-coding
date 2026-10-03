public class PriceLocation4 {
    public static void main(String[] args) {
        int[] prices = {1000, 4000, 5000, 2000};
        int index = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 4000) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("missing");
        } else {
            System.out.println("index = " + index);
        }

    }
}
