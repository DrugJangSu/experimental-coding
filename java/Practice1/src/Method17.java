public class Method17 {
    public int findMax(int [] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Method17 m = new Method17();
        int [] numbers = {-4, -7, -2};
        System.out.println(m.findMax(numbers));
    }
}
