import java.util.HashMap;

public class PetBook {
    HashMap<Integer, Pet> pets = new HashMap<>();

    void addPet(int no, Pet pet) {
        pets.put(no, pet);
    }

    void printOne(int number) {
        if (pets.containsKey(number)) {
            pets.get(number).printInfo();
        } else {
            System.out.println("not found");
        }
    }
}
