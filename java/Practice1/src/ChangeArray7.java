import java.util.Scanner;

public class ChangeArray7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = Integer.parseInt(sc.next());
        int value = Integer.parseInt(sc.next());

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                numbers[i] = value;
            }
            System.out.println(numbers[i]);
        }


    }
}
