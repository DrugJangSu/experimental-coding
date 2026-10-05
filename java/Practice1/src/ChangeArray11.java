import java.util.Scanner;

public class ChangeArray11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int opposite = numbers.length - 1 - i;
            int temp = numbers[i];
            numbers[i] = numbers[opposite];
            numbers[opposite] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
