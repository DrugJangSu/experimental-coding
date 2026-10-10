public class StudentCheck {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo(1, "kim", "java", 90);

        Student student2 = new Student();
        student2.setInfo(2, "lee", "db", 75);

        student1.printInfo();
        student2.printInfo();

    }
}
