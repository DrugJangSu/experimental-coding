import java.util.ArrayList;
import java.util.HashMap;

public class Academy {
    ArrayList<Student> list = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        list.add(student);
        map.put(student.no, student);
    }

    public void printAll() {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.printInfo();
        }
    }

    void printOne() {}

}
