public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void register(Game game) {
        if (gameRepository.findById(game.getNo()) != null) {
            System.out.println("duplicate no");
        } else {
            gameRepository.save(game);
            System.out.println("registered");
        }
    }
    public void printAll() {
        for (Game game : gameRepository.findAll()) {
            game.printInfo();
        }
    }

    public void printOne(int no) {
        Game game = gameRepository.findById(no);
        if (game == null) {
            System.out.println("not found");
        } else {
            game.printInfo();
        }
    }

}
