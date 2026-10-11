import java.util.HashMap;
import java.util.Scanner;

public class MapBasic4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();
        pet1.setInfo("coco", 3);
        pet2.setInfo("max", 5);
        pet3.setInfo("luna", 2);

        HashMap<Integer, Pet> pets = new HashMap<>();
        pets.put(1, pet1);
        pets.put(2, pet2);
        pets.put(3, pet3);

        int input = sc.nextInt();
        if (pets.containsKey(input)) {
            pets.get(input).printInfo();
        } else {
            System.out.println("not found");
        }





    }
}
