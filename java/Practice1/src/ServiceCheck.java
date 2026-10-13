public class ServiceCheck {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(); s1.setInfo(1, "kim", "java", 90);
        Student s2 = new Student(); s2.setInfo(2, "lee", "db", 75);
        Student s3 = new Student(); s3.setInfo(3, "park", "java", 85);
        Student dup = new Student(); dup.setInfo(2, "choi", "java", 70);

        service.register(s1);
        service.register(s2);
        service.register(s3);
        service.register(dup);
        service.printAll();
        System.out.println("---");
        service.printOne(2);
        service.printOne(9);
    }
}
