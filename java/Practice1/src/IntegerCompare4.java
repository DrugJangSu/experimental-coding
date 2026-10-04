import java.util.Scanner;

public class IntegerCompare4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        if (a % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
