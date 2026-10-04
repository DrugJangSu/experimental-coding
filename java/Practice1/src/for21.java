import java.util.Scanner;

public class for21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size =  Integer.parseInt(input.nextLine());
        int total = 0;

        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(input.nextLine());
                total += number;
        }
        System.out.println(total);
    }
}
