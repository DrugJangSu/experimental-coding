public class Method19 {
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

    public int range(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Method19 m = new Method19();
        int [] numbers = {-4, -7, -2};
        System.out.println(m.range(m.findMax(numbers), m.findMin(numbers)));
    }
}
