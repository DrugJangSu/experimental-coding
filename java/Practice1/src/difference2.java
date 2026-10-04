import java.util.Scanner;

public class difference2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int standard = Integer.parseInt(sc.nextLine());
        int num = Integer.parseInt(sc.nextLine());

        int difference = standard - num;
        if (difference <= 3 && difference >= -3) {
            System.out.println("near");
        } else {
            System.out.println("far");
        }
    }
}
