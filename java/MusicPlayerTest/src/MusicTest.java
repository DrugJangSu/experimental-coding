public class MusicTest {
    public static void main(String[] args) {

        MusicPlayer play1 = new MusicPlayer("Happy", 5);
        play1.printPlayerInfo();

        MusicPlayer play2 = new MusicPlayer("Without me", -20);
        play2.printPlayerInfo();

        MusicPlayer play3 = new MusicPlayer("Heart Shaker", 200);
        play3.printPlayerInfo();

    }
}
