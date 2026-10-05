import java.util.Scanner;

public class ChangeArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
            System.out.println(numbers[i]);
        }

    }
}
