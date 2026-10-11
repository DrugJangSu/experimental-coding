public class PetShopCheck {
    public static void main(String[] args) {
//        PetShop petShop = new PetShop();
        PetShop pets = new PetShop();
        Pet pet1 = new Pet();
        pet1.setInfo("coco", 3);

        Pet pet2 = new Pet();
        pet2.setInfo("max", 5);

        Pet pet3 = new Pet();
        pet3.setInfo("luna", 2);


        pets.addPet(pet1);
        pets.addPet(pet2);
        pets.addPet(pet3);

        pets.printAll();

    }
}
