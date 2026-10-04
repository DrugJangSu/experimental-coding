import java.util.Scanner;

public class for26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int standard = Integer.parseInt(input.nextLine());
        int count1 = 0;
        int count2 = 0;

       for (int i = 0; i < size; i++) {
           int num = Integer.parseInt(input.nextLine());
           if (num >= standard) {
                count1++;
           } else {
                count2++;
           }
       }
       System.out.println(count1);
       System.out.println(count2);
    }
}
