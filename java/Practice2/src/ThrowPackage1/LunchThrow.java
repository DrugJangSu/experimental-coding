package ThrowPackage1;

public class LunchThrow {
    public void takeMenu(String menu) {
        if (menu == null || menu.equals("")) {
            throw new IllegalArgumentException("empty-menu");
        }
        System.out.println("menu=" + menu);
    }

    public static void main(String[] args) {
        LunchThrow app = new LunchThrow();
        app.takeMenu("kimbap");
        app.takeMenu("");
        app.takeMenu("pork");
    }
}
