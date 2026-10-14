public class CourseCheck {
    public static void main(String[] args) {
        CourseRepository repository = new MemoryCourseRepository();
        CourseService service = new CourseService(repository);

        service.register(new Course(1, "java", 20));
        service.register(new Course(2, "spring", 30));
        service.register(new Course(3, "sql", 15));
        service.register(new Course(2, "docker", 10));
        service.printAll();
        System.out.println("---");
        service.printOne(3);
        service.printOne(7);
    }
}