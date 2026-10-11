public class Pet {
    String name;
    int age;

    void setInfo(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    void printInfo() {
        System.out.println(name + " " + age);
    }

}
