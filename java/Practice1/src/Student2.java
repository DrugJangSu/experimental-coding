public class Student2 {
    int no;
    String name;
    String subject;
    int score;

    public Student2(int no, String name, String subject, int score) {
        this.no = no;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    void printInfo() {
        System.out.println(no + " " + name + " " + subject + " " + score);
    }
}
