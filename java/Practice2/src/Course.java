public class Course {
    private int no;
    private String title;
    private int hours;

    public Course(int no, String title, int hours) {
        this.no = no;
        this.title = title;
        this.hours = hours;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public void printInfo() {
        System.out.println(no + " " + title + " " + hours);
    }

}
