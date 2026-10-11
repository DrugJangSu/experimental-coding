public class Animal {
    String name;
    int age;


    void setInfo(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    void printInfo() {
        System.out.println("이름" + name + " | 나이:" + age);
    }

    void makeSound() {
        System.out.println(name + ": 동물이 소리를 내요.");
    }

}
