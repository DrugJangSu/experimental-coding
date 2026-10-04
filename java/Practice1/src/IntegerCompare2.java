import java.util.Scanner;

public class IntegerCompare2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        if (a >= 10 && a <= 20) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }
    }
}
