import java.util.*;
class Solution {
    public String solution(String s) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); ++i) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (Character ch : list) {
            sb.append(ch);
        }
        String answer = sb.toString();
 
        return answer;
    }
}