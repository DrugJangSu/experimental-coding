import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {
        System.out.println("Enter the number.");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println(number);

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
