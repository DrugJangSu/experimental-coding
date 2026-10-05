public class Method6 {
    public void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Method6 m = new Method6();
        m.printEvenOdd(4);
        m.printEvenOdd(7);
        m.printEvenOdd(0);
    }
}
