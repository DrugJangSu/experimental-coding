import java.util.ArrayList;
import java.util.HashMap;

public class MemoryStudentRepository implements StudentRepository {
    ArrayList<Student> list = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    public void save(Student student) {
        list.add(student);
        map.put(student.no, student);
    }

    public Student findById(int no) {
        return map.get(no);
    }

    public ArrayList<Student> findAll() {
        return list;
    }

    public void deleteById(int no) {
        Student target = map.get(no);
        map.remove(no);
        list.remove(target);
    }

    public ArrayList<Student> findAllBySubject(String subject) {
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : list) {
            if (student.subject.equals(subject)) {
                temp.add(student);
            }
        }
        return temp;
    }
}