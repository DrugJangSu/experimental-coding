import java.util.ArrayList;

public interface MenuRepository {
    void save(Menu menu);
    Menu findById(int no);
    ArrayList<Menu> findAll();
}
