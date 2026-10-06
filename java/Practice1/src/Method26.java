public class Method26 {
    public void swap(int [] numbers, int a, int b) {
        int temp = 0;
        temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public void reverse(int [] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int opposite = numbers.length -1 - i;
            swap(numbers, i, opposite);
        }
    }


    public static void main(String[] args) {
        Method26 m = new Method26();
        int [] numbers = {10, 20, 30, 40};
        m.reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
