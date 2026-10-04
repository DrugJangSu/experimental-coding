import java.util.Scanner;

public class for27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = Integer.parseInt(input.nextLine());
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num > 0) {
                count1++;
            } else if (num == 0) {
                count2++;
            } else {
                count3++;
            }

            }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        }
    }

