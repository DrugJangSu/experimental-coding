public class Method16 {
    public int countAtLeast(int [] numbers, int standard) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= standard) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Method16 m = new Method16();
        int [] numbers = {4, 7, 2, 9};
        System.out.println(m.countAtLeast(numbers, 5));
        System.out.println(m.countAtLeast(numbers, 10));

    }
}
