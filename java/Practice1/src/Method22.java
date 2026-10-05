import java.util.Arrays;

public class Method22 {

    public int [] makeReversed(int [] numbers) {
        int [] reversed = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - i - 1];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Method22 m = new Method22();
        int[] numbers = {4, 7, 2, 9};
        int [] result = m.makeReversed(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
