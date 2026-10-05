import java.util.Scanner;

public class target3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int target = Integer.parseInt(sc.nextLine());
        int first = -1;
        int last = -1;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == target) {
                if (first == -1) {
                    first = i + 1;
                }
                if (first != -1) {
                    last = i + 1;
                }
            }
        }
        if (first == -1) {
            System.out.println("missing");
        } else if (last == -1) {
            System.out.println(first);
        } else {
            System.out.println(first + " " + last);
        }
    }
}
