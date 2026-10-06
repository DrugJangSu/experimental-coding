public class Method25 {

    public void swap(int [] numbers, int a, int b) {
        int temp = 0;
        temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public static void main(String[] args) {
        Method25 m = new Method25();
        int [] numbers = {4, 7, 2};

        m.swap(numbers, 0, 2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
