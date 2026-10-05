public class Method20 {
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

    public int range(int [] numbers) {
        int max = findMax(numbers);
        int min = findMin(numbers);
        return max - min;
    }

    public static void main(String[] args) {
        Method20 m = new Method20();
        int [] numbers = {-4, -7, -2};
        System.out.println(m.range(numbers));
    }
}
