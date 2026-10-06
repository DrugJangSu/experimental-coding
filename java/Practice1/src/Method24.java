import java.util.Arrays;

public class Method24 {
    public void replaceNegatives(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <0) {
                numbers[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Method24 m = new Method24();
        int [] numbers = {4, -7, -2};

        m.replaceNegatives(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
