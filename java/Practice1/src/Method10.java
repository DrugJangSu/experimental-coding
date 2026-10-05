public class Method10 {
    public int doubleNumber(int number) {
        return number * 2;
    }
    public static void main(String[] args) {
        Method10 m = new Method10();
        int result  = m.doubleNumber(4);
        System.out.println(result);
    }
}
