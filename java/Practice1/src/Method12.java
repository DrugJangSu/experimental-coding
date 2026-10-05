public class Method12 {
    public int sumArray(int [] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Method12 m = new Method12();
        int [] numbers = {3, -2, 7};
        int result = m.sumArray(numbers);
        System.out.println(result);
    }
}
