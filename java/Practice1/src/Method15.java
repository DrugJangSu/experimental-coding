public class Method15 {
    public int findIndex (int [] numbers, int target) {
    int index = -1;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            index = i;
            break;
        }
    }
    return index;
    }

    public static void main(String[] args) {
        Method15 m = new Method15();
        int [] numbers = {4, 7, 7, 2};
        System.out.println(m.findIndex(numbers, 7));
        System.out.println(m.findIndex(numbers, 9));
    }
}
