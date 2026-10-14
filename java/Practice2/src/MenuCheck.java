public class MenuCheck {
    public static void main(String[] args) {
        MenuRepository repository = new MemoryMenuRepository();
        MenuService service = new MenuService(repository);
        service.register(new Menu(1, "americano", 3000));
        service.register(new Menu(2, "latte", 3500));
        service.register(new Menu(3, "tea", 2500));
        service.register(new Menu(2, "mocha", 4000));
        service.printAll();
        System.out.println("---");
        service.printOne(2);
        service.printOne(9);
    }
}
