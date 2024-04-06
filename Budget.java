import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0, sum = 0;
        for(int i = 0; i < d.length; ++i) {
            sum += d[i];
            if(sum <= budget)   ++answer; 
            else                break;
        }
        return answer;
    }
}