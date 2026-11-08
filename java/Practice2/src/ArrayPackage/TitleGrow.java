package ArrayPackage;

import java.util.ArrayList;

public class TitleGrow {
    public static void main(String[] args) {
        ArrayList<String> titles = new ArrayList<>();
        System.out.println("size=" + titles.size());

        titles.add("closed");
        titles.add("exam");
        titles.add("holiday");
        System.out.println("size=" + titles.size());

        for (int i = 0; i < titles.size(); i++) {
            System.out.println(i + "=" + titles.get(i));
        }
    }
}
