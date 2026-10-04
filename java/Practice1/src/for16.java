import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int count = 0;

        for (int i = n; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("missing");
        }
    }
}
