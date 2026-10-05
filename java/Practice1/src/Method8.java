public class Method8 {
    public void printArraySum(int [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Method8 m = new Method8();
        int [] prices = {4, 7, 2};
        m.printArraySum(prices);
    }
}
