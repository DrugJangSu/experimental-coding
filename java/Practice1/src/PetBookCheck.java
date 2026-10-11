import java.util.Scanner;

public class PetBookCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetBook book = new PetBook();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();
        pet1.setInfo("coco", 3);
        pet2.setInfo("max", 5);
        pet3.setInfo("luna", 2);

        book.addPet(1, pet1);
        book.addPet(2, pet2);
        book.addPet(3, pet3);

        int input = Integer.parseInt(sc.nextLine());
        book.printOne(input);

    }
}
