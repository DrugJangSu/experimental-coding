import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> songs = new ArrayList<Song>();

    void addSong(Song song) {
        songs.add(song);
    }
    void printAll() {
        for (int i = 0; i < songs.size(); i++) {
            songs.get(i).printInfo();
        }
    }
}
