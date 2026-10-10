import java.util.ArrayList;

public class GradeListCheck {
    public static void main(String[] args) {
        Grade g1 = new Grade();
        g1.name = "kim";
        g1.kor = 80;
        g1.eng = 90;

        Grade g2 = new Grade();
        g2.name = "lee";
        g2.kor = 70;
        g2.eng = 60;

        Grade g3 = new Grade();
        g3.name = "park";
        g3.kor = 90;
        g3.eng = 85;

        Grade g4 = new Grade();
        g4.name = "choi";
        g4.kor = 50;
        g4.eng = 60;

        ArrayList<Grade> grades = new ArrayList<>();
        grades.add(g1);
        grades.add(g2);
        grades.add(g3);
        grades.add(g4);
        int pass = 0;
        int bestScore = 0;
        String bestName = "";


        for (int i = 0; i < grades.size(); i++) {
            int score = grades.get(i).sum();
            System.out.println(grades.get(i).name + "=" + score);
            if (score > bestScore) {
                bestScore = score;
                bestName = grades.get(i).name;
                }
            if (score >= 150) {
                pass++;
            }
        }
        System.out.println("pass=" + pass);
        System.out.println("best=" +bestName);

    }
}
