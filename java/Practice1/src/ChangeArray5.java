import java.util.Scanner;

public class ChangeArray5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] numbers = new int[3];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int index = Integer.parseInt(sc.next());
        int value = Integer.parseInt(sc.next());

        numbers[index] = value;
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
