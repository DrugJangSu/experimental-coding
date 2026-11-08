package ThrowPackage1;

import java.awt.*;

public class MenuFlow {
    public void validateMenu(String menu) {
        if (menu == null || menu.equals("")) {
            throw new IllegalArgumentException("empty-menu");
        }
    }
    public void order(String menu) {
        validateMenu(menu);
        System.out.println("order=" + menu);
    }

    public static void main(String[] args) {
        MenuFlow app = new MenuFlow();
        app.order("kimbap");
        app.order("");
        System.out.println("done=ok");
    }

}
