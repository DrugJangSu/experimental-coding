import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[3];
        int location = 0;
        boolean exist = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                location = i;
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println(location);
        } else {
            System.out.println("missing");
        }

    }
}
