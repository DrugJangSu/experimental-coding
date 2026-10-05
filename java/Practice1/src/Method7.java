public class Method7 {

    public void printSumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
        sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Method7 m = new Method7();
        m.printSumTo(3);
        m.printSumTo(5);
    }
}
