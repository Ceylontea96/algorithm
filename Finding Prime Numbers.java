import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numList = new int[n+1];
        for(int i = 2 ; i <= n; ++i) {
            numList[i] = i;
        }
        
        for(int i = 2 ; i <= n; ++i) {
            if(numList[i] == 0) continue;
            for(int j = 2*i ; j <= n; j+=i) {
                numList[j] = 0;
            }
        }
        
        for(int i = 0 ; i <= n; ++i) {
            if(numList[i] != 0) ++answer;
        }
        
        return answer;
    }
    
    
}