public class Method18 {
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int findMin(int [] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }



    public static void main(String[] args) {
        Method18 m = new Method18();
        int [] numbers = {-4, -7, -2};
        System.out.println(m.findMax(numbers) - m.findMin(numbers));
    }
}
