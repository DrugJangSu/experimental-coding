import java.util.ArrayList;

public interface CourseRepository {
    void save(Course course);
    Course findById(int no);
    ArrayList<Course> findAll();
}
