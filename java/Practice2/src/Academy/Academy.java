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

    void printAll() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printInfo();
        }
    }

    void printOne(int no) {
        if (!map.containsKey(no)) {
            System.out.println("없는 번호: " + no);
        } else {
            map.get(no).printInfo();
        }
    }

    public static void main(String[] args) {
    Academy academy = new Academy();
    academy.addStudent(1, "홍길동", "Java", 90);
    academy.addStudent(2, "김철수", "Java", 85);
    academy.addStudent(3, "이영희", "Python", 95);
    academy.addStudent(4, "박민수", "Java", 70);

    academy.printAll();
    academy.printOne(3);
    academy.printOne(9);
    }
}
