import java.util.Scanner;

public class IntegerCompare3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        if (a >= 13 && a <= 19) {
            System.out.println("teen");
        } else {
            System.out.println("other");
        }

    }
}
