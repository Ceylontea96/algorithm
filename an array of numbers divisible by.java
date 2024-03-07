import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; ++j) {
            answer[j] = list.get(j).intValue();
        }
        return answer;
    }
}