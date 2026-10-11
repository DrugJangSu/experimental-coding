import java.util.ArrayList;

public class PetShop {
    ArrayList <Pet> pets = new ArrayList<>();

    void addPet(Pet pet) {
        pets.add(pet);
    }

    void printAll() {
        for (int i = 0; i < pets.size(); i++) {
            pets.get(i).printInfo();
        }
    }

}
