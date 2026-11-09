package CafePackage;

public class PriceStats {
    public static void main(String[] args) {
        int [] prices = {4500, 1000, 2000, 5000};

        // 합
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        System.out.println(total);

        // 최대
        int max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println(max);

        // 개수 (4000 이상)
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= 4000) {
                count++;
            }
        }
        System.out.println(count);

        // 찾기 (2000은 몇 번째?)
        boolean found = false;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 2000) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("missing");
        }
    }
}
