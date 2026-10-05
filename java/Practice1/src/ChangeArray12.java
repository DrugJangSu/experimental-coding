import java.util.Scanner;

public class ChangeArray12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[3];
        int [] copied = new int[3];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            copied[i] = numbers[i];
        }
        numbers[0] = 99;
        for(int i = 0; i < numbers.length; i++){
            System.out.println(copied[i]);
        }
    }
}
