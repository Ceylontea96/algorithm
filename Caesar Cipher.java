class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            char chr = s.charAt(i);
            
            if(chr >= 65 && chr <= 90) {
                chr += n;
                if(chr > 90) chr-= 26;
            } else if(chr >= 97 && chr <= 122) {
                chr += n;
                if(chr > 122) chr-= 26;
            }
            
            sb.append((char)chr);
        }
        return sb.toString();
    }
}