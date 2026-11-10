package Academy2;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentRepository {
    ArrayList<Student> list = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    void save(Student s) {
        list.add(s);
        map.put(s.no, s);
    }

    ArrayList<Student> findAll() {
        return list;
    }

    Student findByNo(int no) {
        return map.get(no);
    }

    void updateScore(Student s, int newScore) {
        s.score = newScore;
    }

    void delete(int no) {
        Student s = map.remove(no);
        list.remove(s);
    }

    ArrayList<Student> findAllBySubject(String subject) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.subject.equals(subject)) {
                result.add(s);
            }
        }
        return result;
    }
}