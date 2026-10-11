import java.util.HashMap;
import java.util.Scanner;

public class MapBasic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();

        song1.setInfo("intro", 3);
        song2.setInfo("dance", 4);
        song3.setInfo("ending", 5);


        HashMap<Integer, Song> songs = new HashMap<Integer, Song>();
        songs.put(1, song1);
        songs.put(2, song2);
        songs.put(3, song3);

        int input = Integer.parseInt(sc.nextLine());
        if (songs.containsKey(input)) {
            songs.get(input).printInfo();
            System.out.println("min=" + songs.get(input).minutes);
        } else {
            System.out.println("not found");
        }



    }
}
