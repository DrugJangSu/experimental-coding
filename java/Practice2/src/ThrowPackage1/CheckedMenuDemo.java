package ThrowPackage1;

public class CheckedMenuDemo {
    public void loadMenu() throws Exception {
        throw new Exception("menu-load-failed");
    }

    public static void main(String[] args) {
        CheckedMenuDemo app = new CheckedMenuDemo();
        try {
            app.loadMenu();
        } catch (Exception ex) {
            System.out.println("reject=" + ex.getMessage());
        }
    }
}
