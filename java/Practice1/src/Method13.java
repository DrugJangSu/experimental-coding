public class Method13 {
    public boolean isEven (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Method13 m = new Method13();
        System.out.println(m.isEven(4));
    }
}
