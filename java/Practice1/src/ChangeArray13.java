import java.util.Scanner;

public class ChangeArray13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        int [] doubled = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            doubled[i] = numbers[i] * 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " " + doubled[i]);
        }
    }
}
