import java.util.ArrayList;
import java.util.HashMap;

public class MemoryCourseRepository implements CourseRepository {
    ArrayList<Course> list = new ArrayList<>();
    HashMap<Integer, Course> map = new HashMap<>();


    public void save(Course course) {
        list.add(course);
        map.put(course.getNo(), course);
    }
    public Course findById(int no) {
        return map.get(no);
    }
    public ArrayList<Course> findAll() {
        return list;
    }

}
