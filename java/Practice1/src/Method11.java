public class Method11 {
    public int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Method11 m = new Method11();
        int result = m.min(7, 3);
        System.out.println(result);
    }

}
