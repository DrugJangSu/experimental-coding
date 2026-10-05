import java.util.Scanner;

public class ChangeArray14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        int [] absolute = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0) {
                absolute[i] = numbers[i] * -1;
            } else {
                absolute[i] = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " " + absolute[i]);
        }
    }
}
