import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= 9; i++) {
            System.out.println(n * i);
        }
    }
}
