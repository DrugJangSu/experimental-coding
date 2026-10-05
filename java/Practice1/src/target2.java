import java.util.Scanner;

public class target2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int target = Integer.parseInt(sc.nextLine());
        int position = -1;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == target) {
                position = i + 1;
            }
        }
        if (position == -1) {
            System.out.println("missing");
        } else {
            System.out.println(position);
        }

    }
}
