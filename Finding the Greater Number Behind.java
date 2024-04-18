import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[numbers.length];
        Arrays.fill(result, -1); // 결과 배열을 -1로 초기화

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                // 현재 수보다 작은 수들은 뒷 큰 수가 될 수 없으므로 해당 수들에 대한 뒷 큰 수를 현재 수로 갱신
                result[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return result;
    }
}