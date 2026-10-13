public class Student2 {
    private int no;
    private String name;
    private String subject;
    private int score;
    private static int count = 0;

    public Student2(int no, String name, String subject, int score) {
        this.no = no;
        this.name = name;
        this.subject = subject;
        this.score = score;
        count++;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    void printInfo() {
        System.out.println(no + " " + name + " " + subject + " " + score);
    }

    void changeScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("invalid score");
        } else {
            this.score = score;
            System.out.println("updated!");
        }
    }



}
