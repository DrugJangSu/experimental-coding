public class Student {
    int no;
    String name;
    String subject;
    int score;


    public void setInfo(int pNo, String pName, String pSubject, int pScore) {
        no = pNo;
        name = pName;
        subject = pSubject;
        score = pScore;
    }

    public void printInfo()  {
        System.out.println(no + " " + name + " " + subject + " " + score);
    }


}
