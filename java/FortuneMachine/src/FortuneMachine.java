import java.util.Random;
import java.util.Scanner;

public class FortuneMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("=== 오늘의 운세 뽑기 ===");
        System.out.println("이름을 입력하세요 : ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            name = "익명의 모험가";
        }

        String[] fortunes = {
                "미뤄둔 일을 시작하면 의외로 쉽게 풀릴 거에요.",
                "맛있는 음식이 기분을 좋게 해줄 거에요.",
                "작은 실수가 재미있는 추억이 될 거에요.",
                "뜻밖의 칭찬을 듣게 될 지도 몰라요.",
                "오늘은 잠깐 쉬어가도 좋은 날이에요."
        };

        int index = random.nextInt(fortunes.length);
        int luckyNumber = random.nextInt(10) + 1;

        System.out.println("\n" + name + "님의 오늘의 운세!");
        System.out.println(fortunes[index]);
        System.out.println("행운의 숫자: " + luckyNumber);
        System.out.println("재미로만 봐주세요!");

        scanner.close();

    }
}
