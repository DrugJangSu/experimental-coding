import java.util.*;

/*
 * [Ct164] 두 개 뽑아서 더하기 (예상 · Lv.1 집합 + 정렬)
 * 서로 다른 두 수를 뽑아 더한 값들을 중복 없이 오름차순으로
 */
public class Ct164PickTwoSum {

    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {     // 내 오른쪽과만 짝
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx] = num;
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Ct164PickTwoSum q = new Ct164PickTwoSum();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{2, 1, 3, 4, 1})) + " / 정답: [2, 3, 4, 5, 6, 7]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5, 0, 2, 7})) + " / 정답: [2, 5, 7, 9, 12]");
    }
}