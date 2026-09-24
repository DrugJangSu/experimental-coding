import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드 입력을 위해 Scanner 객체 생성

        System.out.println("=== 간단한 계산기 ===");
        System.out.println("두 숫자와 연산자를 입력하세요.");
        System.out.println("예시 : 10 + 5");

        System.out.println("첫 번째 숫자 : ");
        double num1 = scanner.nextDouble(); // 첫 번째 숫자 입력. nextDouble()는 소숫점도 받을 수 있음

        System.out.println("연산자 (+, -, 8, /)");
        String operator = scanner.next(); // 연산자 입력받기. next()는 공백 전까지만 읽어오며 한 글자용으로 적합.

        System.out.println("두 번째 숫자 : ");
        double num2 = scanner.nextDouble(); // 두 번째 숫자 입력.

        double result = 0; // 결과를 담을 변수 (미리 생성)

        switch (operator) { // switch문은 if-else를 더 깔끔하게 쓰는 방법. operator에 들어있는 값에 따라 해당하는 case를 실행함.
            case "+":
                result = num1 + num2;
                break; // break을 쓰지 않으면 다음 case까지 실행되므로 꼭 필요함
            case "-":
                result = num1 - num2;
                break; // break은 해당 반복문이나 switch문에서만 빠져나감
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) { // 0으로 나누면 Java 오류가 발생하는 관계로 예외처리를 꼭 해줘야 함.
                    System.out.println("0으로 나눌 수 없습니다");
                    scanner.close();
                    return; // 프로그램 종료
                }
                result = num1 / num2;
                break;
            default: // default문은 위에 있는 것들이 아닌 다른 게 들어올 때 실행됨. 즉 예외상황(잘못된 입력)을 처리하기 위한 안전장치. 없어도 돌아가지만, 잘못된 값을 넣었을 때의 오류 방지용으로 넣음
                System.out.println("잘못된 연산자입니다!");
                scanner.close();
                return; // 프로그램 종료

        }
        System.out.printf("결과 : %.2f\n", result); // 결과값 출력. printf를 사용하면 소숫점 자릿수를 조절가능(%.2f는 소수점 둘째 자리까지를 의미함)
        scanner.close();

    }
}
