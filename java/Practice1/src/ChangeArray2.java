import java.util.Scanner;

public class ChangeArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 10;
            System.out.println(numbers[i]);
        }

    }
}
