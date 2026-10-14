public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public void register(Course course) {
        if (courseRepository.findById(course.getNo()) != null) {
            System.out.println("duplicate no");
        } else {
            courseRepository.save(course);
            System.out.println("registered");
        }
    }

    public void printAll() {
        for (Course course : courseRepository.findAll()) {
            course.printInfo();
        }
    }
    public void printOne(int no) {
        Course course = courseRepository.findById(no);
        if (course == null) {
            System.out.println("not found");
        } else {
            course.printInfo();
        }
    }
}
