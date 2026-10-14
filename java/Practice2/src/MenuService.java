public class MenuService {
    private MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }
    public void register(Menu menu) {
        if (menuRepository.findById(menu.getNo()) != null) {
            System.out.println("duplicate no");
        } else {
            menuRepository.save(menu);
            System.out.println("registered");
        }
    }

    public void printAll() {
        for (Menu menu : menuRepository.findAll()) {
            menu.printInfo();
        }
    }

    public void printOne(int no) {
        Menu menu = menuRepository.findById(no);
        if (menu == null) {
            System.out.println("not found");
        } else {
            menu.printInfo();
        }
    }
}
