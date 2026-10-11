public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setInfo("기본 동물", 1);

        Dog dog = new Dog();
        dog.setInfo("초코", 3);

        Cat cat = new Cat();
        cat.setInfo("나비", 2);

        System.out.println("=== 기본 동물 ===");
        animal.printInfo();
        animal.makeSound();
        System.out.println("\n=== 강아지 ===");
        dog.printInfo();
        dog.makeSound();
        dog.bringBall();
        System.out.println("\n=== 고양이 ===");
        cat.printInfo();
        cat.makeSound();
        cat.scratch();
    }
}
