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

    void printOne(int number) {
        if (map.containsKey(number)) {
            map.get(number).printInfo();
        } else {
            System.out.println("not found");
        }
    }

    void updateScore(int number, int score) {
        if ((score < 0) || (score > 100)) {
            System.out.println("invalid number");
        } else if (!map.containsKey(number)) {
            System.out.println("not found");
        } else {
            map.get(number).score = score;
            System.out.println("updated");
        }
    }
    void deleteStudent(int number) {
        if (!map.containsKey(number)) {
            System.out.println("not found");
        } else {
            map.remove(number);
            list.remove(number);
            System.out.println("deleted");
        }
    }

}
