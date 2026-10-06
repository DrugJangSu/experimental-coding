public class Method23 {

    public void addTen(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 10;
        }
    }

    public static void main(String[] args) {
        Method23 m = new Method23();
        int [] numbers = {3, -2, 5};
        m.addTen(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
