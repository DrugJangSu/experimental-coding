import java.util.Scanner;

public class ScoreCheck1 {
    public static void main(String[] args) {
        System.out.println("Enter tha name of scores;");
        Scanner input = new Scanner(System.in);
        int score = Integer.parseInt(input.nextLine());
        System.out.println(score);

        if (score >= 60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
