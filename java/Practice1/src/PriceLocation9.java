// Scanner: 키보드로 입력받을 때 쓰는 도구입니다. 이 도구는 java.util 꾸러미 안에 있어서 먼저 불러와야(import) 합니다.
import java.util.Scanner;

// 클래스: 자바 프로그램의 기본 단위(상자)입니다. 파일 이름(PriceLocation9)과 똑같이 써야 합니다.
public class PriceLocation9 {
    // main: 프로그램을 실행하면 가장 먼저 시작되는 곳입니다. 여기서부터 위에서 아래로 한 줄씩 실행돼요.
    public static void main(String[] args) {
        // 키보드 입력(System.in)을 읽을 수 있는 Scanner를 만들고, input이라는 이름을 붙입니다.
        Scanner input = new Scanner(System.in);

        // 첫 번째 줄을 입력받아 "가격이 몇 개인지"를 n에 저장합니다.
        // nextLine()은 한 줄을 글자(문자열)로 읽고, Integer.parseInt()는 그 글자를 숫자로 바꿔줍니다.
        // 예: "5" (글자) -> 5 (숫자)
        int n = Integer.parseInt(input.nextLine());

        // 가격을 담을 정수 배열(같은 종류의 값을 줄지어 담는 칸들)을 n칸 만듭니다.
        // 예: n이 3이면 prices[0], prices[1], prices[2] 세 칸이 생깁니다. (번호는 0부터 시작!)
        int[] prices = new int[n];

        // 기준 가격 이상인 가격이 "몇 개"인지 세는 변수입니다. 처음엔 0개로 시작합니다.
        int count = 0;

        // 기준 가격 이상인 가격들의 "합계"를 저장하는 변수입니다. 처음엔 0으로 시작합니다.
        int total = 0;


        // 반복문: i가 0부터 (배열 칸 수 - 1)까지 1씩 커지며 안의 내용을 반복합니다.
        // prices.length는 배열의 칸 수(= n)입니다.
        for (int i = 0; i < prices.length; i++) {
            // 가격을 한 줄씩 입력받아 숫자로 바꾼 뒤, i번째 칸에 저장합니다.
            prices[i] = Integer.parseInt(input.nextLine());
        }

        // 모든 가격을 다 입력받은 뒤, 마지막으로 "기준 가격"을 입력받아 standard에 저장합니다.
        int standard = Integer.parseInt(input.nextLine());

        // 이번에는 저장해둔 가격들을 처음부터 끝까지 하나씩 꺼내 확인합니다.
        for (int i = 0; i < prices.length; i++) {
            // 조건문: i번째 가격이 기준 가격보다 크거나 같으면(>=) 중괄호 안을 실행합니다.
            if (prices[i] >= standard) {
                // 조건에 맞는 가격이 하나 더 나왔으니 개수를 1 늘립니다. (count++ 는 count = count + 1 과 같아요)
                count++;
                // 그 가격을 합계에 더합니다. (total += x 는 total = total + x 와 같아요)
                total += prices[i];
            }
        }

        // 결과를 화면에 출력합니다. "글자" + 숫자 처럼 + 로 이어 붙이면 한 줄로 나옵니다.
        System.out.println("count = " + count);  // 기준 가격 이상인 가격의 개수
        System.out.println("total = " + total);  // 기준 가격 이상인 가격의 합계

    }
}
