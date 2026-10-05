public class Method5 {
    public void printMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }


    public static void main(String[] args) {
        Method5 m = new Method5();
        m.printMax(3, 8);
        m.printMax(7, 2);
        m.printMax(5, 5);
    }
}
