public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println(name + ": 멍멍!");
    }

    void bringBall() {
        System.out.println(name + "이 공을 가져왔어요.");
    }
}
