import java.util.Scanner;

public class TeamTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        int result = A * B * C;

        String resultString = String.valueOf(result);

        String digits = "0123456789";

        for (int i = 0; i < 10; i++) {
            char digit = digits.charAt(i);
            int count = 0;

            for (int j = 0; j < resultString.length(); j++) {
                char c = resultString.charAt(j);

                if (c == digit) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}