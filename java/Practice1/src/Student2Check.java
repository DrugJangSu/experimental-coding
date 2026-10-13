public class Student2Check {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "kim", "java", 90);
        Student2 s2 = new Student2(2, "lee", "db", 75);

        s1.printInfo();
        s2.printInfo();
        System.out.println("---");
        System.out.println(s1.getName() + " score=" + s1.getScore());
        s1.changeScore(150);
        s1.changeScore(95);
        s1.printInfo();

    }
}
