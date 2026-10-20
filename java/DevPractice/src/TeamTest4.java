import java.util.Scanner;

public class TeamTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        int colCount = sc.nextInt();

        String[] castle = new String[rowCount];
        for (int i = 0; i < rowCount; i++) {
            castle[i] = sc.next();
        }

        int emptyRows = 0;
        for (int i = 0; i < rowCount; i++) {
            String row = castle[i];
            if (row.contains("X") == false) {
                emptyRows++;
            }
        }

        int emptyCols = 0;
        for (int j = 0; j < colCount; j++) {
            String col = "";
            for (int i = 0; i < rowCount; i++) {
                col += castle[i].charAt(j);
            }
            if (col.contains("X") == false) {
                emptyCols++;
            }
        }
        if (emptyRows > emptyCols) {
            System.out.println(emptyRows);
        } else {
            System.out.println(emptyCols);
        }
    }
}
