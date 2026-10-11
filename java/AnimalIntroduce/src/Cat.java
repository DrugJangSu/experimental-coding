public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + ": 야옹!");
    }

    void scratch() {
        System.out.println(name + "이 스크래치를 긁어요.");
    }
}
