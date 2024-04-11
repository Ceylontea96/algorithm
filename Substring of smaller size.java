class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len1 = t.length(), len2 = p.length();
        for(int i = 0; i <= len1-len2; ++i) {
            long val1 = Long.parseLong(t.substring(i, i+len2)), val2 = Long.parseLong(p);
            if(val1 <= val2) ++answer;
        }
        return answer;
    }
}