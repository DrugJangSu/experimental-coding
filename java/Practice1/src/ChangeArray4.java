import java.util.Scanner;

public class ChangeArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int tempA = 0;
        int tempB = 0;
        tempA = numbers[a];
        tempB = numbers[b];
        numbers[b] = tempA;
        numbers[a] = tempB;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
