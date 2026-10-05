import java.util.Scanner;

public class ChangeArray10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[4];
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }
        temp1 = numbers[3];
        temp2 = numbers[2];
        numbers[3] = numbers[0];
        numbers[2] = numbers[1];
        numbers[0] = temp1;
        numbers[1] = temp2;
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }
    }
}
