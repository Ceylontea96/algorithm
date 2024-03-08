import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 1; i < strings.length; ++i) {
            strings = sorting(strings, n, i);
        }
        String[] answer = strings;
        return answer;
    }
    public String[] sorting(String[] strs, int n, int i) {
            if(strs[i].charAt(n) < strs[i-1].charAt(n)) {
                    String tmp = strs[i-1];
                    strs[i-1] = strs[i];
                    strs[i] = tmp;
            } else if(strs[i].charAt(n) == strs[i-1].charAt(n)) {
                String[] temp = new String[2];
                temp[0] = strs[i-1];
                temp[1] = strs[i];
                Arrays.sort(temp);
                strs[i-1] = temp[0];
                strs[i] = temp[1];
            }
        
            if(i > 1 && strs[i-1].charAt(n) <= strs[i-2].charAt(n)) {
                sorting(strs, n, i-1);
            }
        
            return strs;
            
        }
    
}