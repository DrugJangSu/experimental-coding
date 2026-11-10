package Academy;

import java.util.ArrayList;
import java.util.HashMap;

public class Academy {
    ArrayList<Student> list = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    void addStudent(int no, String name, String subject, int score) {
        Student s = new Student();
        s.setInfo(no, name, subject, score);
        list.add(s);
        map.put(no, s);
        System.out.println("등록 완료: " + name);
    }

    public static void main(String[] args) {
    Academy academy = new Academy();
    academy.addStudent(1, "홍길동", "Java", 90);
    }
}
