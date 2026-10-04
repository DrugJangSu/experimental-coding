import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int difference = a - b;
        if (difference < 0) {
            difference = difference * -1;
        }
        System.out.println(difference);
    }
}
