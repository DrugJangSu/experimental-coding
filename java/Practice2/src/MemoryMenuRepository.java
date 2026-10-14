import java.util.ArrayList;
import java.util.HashMap;

public class MemoryMenuRepository implements MenuRepository {
    ArrayList<Menu> list = new ArrayList<>();
    HashMap<Integer, Menu> map = new HashMap<>();

    public void save(Menu menu) {
        list.add(menu);
        map.put(menu.getNo(), menu);
    }

    public Menu findById(int no) {
        return map.get(no);
    }

    public ArrayList<Menu> findAll() {
        return list;
    }
}
