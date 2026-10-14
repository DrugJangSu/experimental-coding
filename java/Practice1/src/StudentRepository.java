import java.util.ArrayList;

public interface StudentRepository {
    void save(Student student);
    Student findById(int no);
    ArrayList<Student> findAll();
    void deleteById(int no);
    ArrayList<Student> findAllBySubject(String subject);
}