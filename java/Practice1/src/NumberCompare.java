import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        if (a == b) {
            System.out.println("Two numbers are the same");
        } else if (a > b)  {
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(b + " is bigger than " + a);
        }

    }
}
