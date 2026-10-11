public class PlaylistCheck {
    public static void main(String[] args) {
    Playlist playlist = new Playlist();
    Song song1 = new Song();
    song1.setInfo("intro", 3);

    Song song2 = new Song();
    song2.setInfo("dance", 4);

    Song song3 = new Song();
    song3.setInfo("ending", 5);


    playlist.addSong(song1);
    playlist.addSong(song2);
    playlist.addSong(song3);

    playlist.printAll();

    }


}
