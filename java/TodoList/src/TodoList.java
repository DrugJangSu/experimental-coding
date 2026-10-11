import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== 할 일 목록 ===");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 목록 보기");
            System.out.println("3. 종료");
            System.out.println("메뉴 선택: ");

            String menu = scanner.nextLine();

            if (menu.equals("1")) {
                System.out.println("추가할 일: ");
                String todo = scanner.nextLine();
                todos.add(todo);
                System.out.println("추가했어요!");
            } else if (menu.equals("2")) {
                if (todos.isEmpty()) {
                    System.out.println("아직 할 일이 없어요.");
                } else {
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                }
            } else if (menu.equals("3")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("1, 2, 3 중에서 입력해 주세요.");
            }
        }
        scanner.close();
    }
}
