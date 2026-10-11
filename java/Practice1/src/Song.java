public class Song {
    String title;
    int minutes;

    void setInfo(String pTitle, int pMinutes) {
        title = pTitle;
        minutes = pMinutes;
    }

    void printInfo() {
        System.out.println(title + " " + minutes);
    }
}
