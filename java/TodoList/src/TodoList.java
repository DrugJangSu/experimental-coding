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
            System.out.println("3. 완료한 할 일 삭제");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            String menu = scanner.nextLine().trim();

            if (menu.equals("1")) {
                System.out.print("추가할 일: ");
                String todo = scanner.nextLine().trim();

                if (todo.isEmpty()) {
                    System.out.println("할 일을 입력해 주세요.");
                } else if (todos.contains(todo)) {
                    System.out.println("이미 등록된 할 일이에요.");
                } else {
                    todos.add(todo);
                    System.out.println("추가했어요!");
                }

            } else if (menu.equals("2")) {
                if (todos.isEmpty()) {
                    System.out.println("아직 할 일이 없어요.");
                } else {
                    showTodos(todos);
                }

            } else if (menu.equals("3")) {
                if (todos.isEmpty()) {
                    System.out.println("삭제할 일이 없어요.");
                } else {
                    showTodos(todos);

                    System.out.print("완료한 할 일 번호: ");
                    String input = scanner.nextLine().trim();

                    try {
                        int number = Integer.parseInt(input);

                        if (number >= 1 && number <= todos.size()) {
                            String removedTodo = todos.remove(number - 1);
                            System.out.println("완료한 일: " + removedTodo);
                        } else {
                            System.out.println("목록에 있는 번호를 입력해 주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력해 주세요.");
                    }
                }

            } else if (menu.equals("4")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("1, 2, 3, 4 중에서 입력해 주세요.");
            }
        }

        scanner.close();
    }

    public static void showTodos(ArrayList<String> todos) {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ". " + todos.get(i));
        }
    }
}