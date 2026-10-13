public class InheritCheck {
    public static void main(String[] args) {
        Person p = new Person("kim", 20);
        p.printInfo();
        System.out.println("---");
        Teacher t = new Teacher("park", 40, "java");
        t.printInfo();
    }
}
