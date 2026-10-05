import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers =  new int[3];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }
        int target = Integer.parseInt(sc.next());
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
