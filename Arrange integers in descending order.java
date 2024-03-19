import java.util.*;
class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num, Collections.reverseOrder());
        for(String str : num) {
            sb.append(str);
        }
        
        return Long.valueOf(sb.toString());
    }
}