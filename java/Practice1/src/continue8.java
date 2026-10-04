import java.util.Scanner;

public class continue8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int stop = Integer.parseInt(sc.nextLine());
        int skip = Integer.parseInt(sc.nextLine());
        int count = 0;
        int total = 0;

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == stop) {
                break;
            } else if (num == skip) {
                continue;
            } else {
                count++;
                total += num;
            }
        }
        if (count == 0) {
            System.out.println("missing");
        } else {
            System.out.println(count);
            System.out.println(total);
        }
    }
}
