public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("subject=" + subject);
    }

}
