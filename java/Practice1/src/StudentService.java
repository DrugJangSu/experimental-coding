import java.util.ArrayList;

public class StudentService {
    private StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    void register (Student student) {
        if (repository.findById(student.no) != null) {
            System.out.println("duplicate no");
        } else {
            repository.save(student);
            System.out.println("registered");
        }
    }
    void printAll() {
        for (Student student : repository.findAll()) {
            student.printInfo();
        }
    }
    void printOne(int no) {
        Student student = repository.findById(no);
        if (student == null) {
            System.out.println("not found");
        } else {
            student.printInfo();
        }
    }

    void updateScore(int no, int newScore) {
        Student student = repository.findById(no);
        if (newScore < 0 || newScore > 100) {
            System.out.println("invalid score");
        } else if (student == null) {
            System.out.println("not found");
        } else {
            student.score = newScore;
            System.out.println("updated");
        }
    }
    void delete(int no) {
        if (repository.findById(no) == null) {
            System.out.println("not found");
        } else {
            repository.deleteById(no);
            System.out.println("deleted");
        }
    }
    void printBySubject(String subject) {
        ArrayList<Student> found = repository.findAllBySubject(subject);
        if (found.isEmpty()) {
            System.out.println("no student");
        } else {
            for (Student student : found) {
                student.printInfo();
            }
        }

    }
}
