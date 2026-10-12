import java.util.ArrayList;
import java.util.HashMap;

public class StudentRepository {
    ArrayList<Student> list = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    void save(Student student) {
        list.add(student);
        map.put(student.no, student);
    }

    Student findById(int no) {
        return map.get(no);
    }

    ArrayList<Student> findAll() {
        return list;
    }

    void deleteById(int no) {
        Student target = map.get(no);
        map.remove(no);
        list.remove(target);
    }

    ArrayList<Student> findAllBySubject(String subject) {
        ArrayList<Student> temp = new ArrayList<>();
        for (Student student : list) {
            if (student.subject.equals(subject)) {
                temp.add(student);
            }
        }
        return temp;
    }
}
