class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x, sum = 0;
        int length = (int)( Math.log10(temp)+1 );
        for(int i = length-1; i >= 0; --i) {
            int v = (int)Math.pow(10, i);
            sum += temp / v;
            temp %= v;
        }
        if(x % sum != 0) answer = false;
        return answer;
    }
}