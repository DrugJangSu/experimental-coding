public class Method14 {
    public boolean contains(int [] numbers, int target) {
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Method14 m = new Method14();
        int [] numbers = {4, 7, 2};
        System.out.println(m.contains(numbers, 7));
        System.out.println(m.contains(numbers, 9));
    }
}
