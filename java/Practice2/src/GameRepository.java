import java.util.ArrayList;

public interface GameRepository {
    // 게임 하나를 건네받아 저장한다. 받아 오는 건 없다.
    void save(Game game);
    // 번호를 건네받아 게임 하나를 받아 온다.
    void findById();
    // 아무것도 안 건네고 게임 목록을 받아 온다.

    void findAll();
}