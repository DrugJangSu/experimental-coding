import java.util.Scanner;

public class ChangeArray8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers =  new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int value = sc.nextInt();

        for (int i = numbers.length -1; i >= 0; i--) {
            if (numbers[i] == target) {
                numbers[i] = value;
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
