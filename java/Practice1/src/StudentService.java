public class StudentService {
    StudentRepository repository = new StudentRepository();
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
    }

}
