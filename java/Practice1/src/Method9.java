public class Method9 {
    public void printCount(int [] numbers, int standard) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= standard) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Method9 m = new Method9();
        int [] prices = {4, 7, 2, 9};

        m.printCount(prices, 5);
        m.printCount(prices, 8);
    }
}
