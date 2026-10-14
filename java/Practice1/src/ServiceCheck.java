public class ServiceCheck {
    public static void main(String[] args) {
        StudentRepository repository = new MemoryStudentRepository();
        StudentService service = new StudentService(repository);

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
        System.out.println("---");
        service.updateScore(2, 95);
        service.updateScore(2, 150);
        service.updateScore(9, 80);
        System.out.println("---");
        service.delete(1);
        service.delete(9);
        System.out.println("---");
        service.printBySubject("java");
        service.printBySubject("python");
        System.out.println("---");
        service.printAll();
    }
}