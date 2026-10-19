import java.util.ArrayList;
import java.util.HashMap;

public class MemoryGameRepository implements GameRepository {
    ArrayList<Game> list = new ArrayList<>();
    HashMap<Integer, Game> map = new HashMap<>();

    public void save(Game game) {
        list.add(game);
        map.put(game.getNo(), game);
    }

    public Game findById(int no) {
        return map.get(no);
    }

    public ArrayList<Game> findAll() {
        return list;
    }
}
