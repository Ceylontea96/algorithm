class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if(ch == 32) cnt = 0;
            else {
                if(cnt % 2 == 0) ch = Character.toUpperCase(ch);
                else ch = Character.toLowerCase(ch);
                ++cnt;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}