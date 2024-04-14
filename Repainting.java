class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, pos = 0;
        for(int i = 0; i < section.length; ++i) {
            int sec = section[i];
            if(sec <= pos) continue;
            pos = sec + m - 1;
            ++answer;
        }
        return answer;
    }
}