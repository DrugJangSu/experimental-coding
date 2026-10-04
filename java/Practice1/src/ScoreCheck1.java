import java.util.Scanner;

public class ScoreCheck1 {
    public static void main(String[] args) {
        System.out.println("Enter tha name of scores;");
        Scanner input = new Scanner(System.in);
        int score = Integer.parseInt(input.nextLine());
        System.out.println(score);

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
