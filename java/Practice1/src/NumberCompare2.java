import java.util.Scanner;

public class NumberCompare2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        if (a == b) {
            System.out.println("Same");
        } else if (a < b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(b);
        }
    }
}
