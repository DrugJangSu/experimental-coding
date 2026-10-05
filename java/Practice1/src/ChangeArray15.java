import java.util.Scanner;

public class ChangeArray15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        int [] reversed = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int opposite = numbers.length - 1 - i;
            reversed[i] = numbers[opposite];
        }
        for (int i =0; i < numbers.length; i++) {
            System.out.println(reversed[i]);
        }
    }
}
