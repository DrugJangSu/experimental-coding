import java.util.Scanner;

public class ScoreCheck2 {

        public static void main(String[] args) {
            System.out.println("Enter the age.");
            Scanner input = new Scanner(System.in);
            int age = Integer.parseInt(input.nextLine());
            System.out.println(age);
            if (age < 13) {
                System.out.println("The price is 1000.");
            } else if (age >= 13 && age < 65) {
                System.out.println("The price is 2000.");
            } else {
                System.out.println("The price is 0.");
            }

    }
}
