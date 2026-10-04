import java.util.Scanner;

public class IntegerCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());

        if (a > 0) {
            System.out.println("positive");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }
}
