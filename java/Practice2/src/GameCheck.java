public class GameCheck {
    public static void main(String[] args) {
        GameRepository repository = new MemoryGameRepository();
        GameService service = new GameService(repository);

        service.register(new Game(1, "tetris", 5000));
        service.register(new Game(2, "zelda", 60000));
        service.register(new Game(3, "mario", 50000));
        service.register(new Game(3, "sonic", 30000));
        service.printAll();
        System.out.println("---");
        service.printOne(1);
        service.printOne(8);
    }
}
