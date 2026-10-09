public class Grade {
    String name;
    int kor;
    int eng;




    public int sum() {
        return (kor + eng);
    }

    public int withBonus(int bonus) {
        return (sum() + bonus);
    }

}
