public class GradeCheck {
    public static void main(String[] args) {

    Grade grade1 = new Grade();
    grade1.name = "kim";
    grade1.kor = 80;
    grade1.eng = 90;

    Grade grade2 = new Grade();
    grade2.name = "lee";
    grade2.kor = 70;
    grade2.eng = 60;

    System.out.println("kim=" + grade1.sum());
    System.out.println("lee=" + grade2.sum());
    System.out.println("kimBonus=" + grade1.withBonus(10));
    System.out.println("gap=" + gap(grade1.sum(), grade2.sum()));



    }
    public static int gap(int score1, int score2) {
        int scoreDifference = score1 - score2;
        if (scoreDifference < 0) {
            scoreDifference *= -1;
        }
        return scoreDifference;
    }
}
