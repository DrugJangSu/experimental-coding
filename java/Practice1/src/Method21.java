public class Method21 {

    public int [] makeDoubled (int [] numbers) {
        int [] doubled = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubled[i] = numbers[i] * 2;
        }
        return doubled;
    }

    public static void main(String[] args) {
        Method21 m = new Method21();
        int[] numbers = {3, -2, 5};
        int[] result = m.makeDoubled(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
