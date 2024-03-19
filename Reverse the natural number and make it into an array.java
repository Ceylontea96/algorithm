class Solution {
    public int[] solution(long n) {
        
        String number = String.valueOf(n);
        int len = number.length(), index = len - 1;
        int[] answer = new int[len];
        
        for(int i = len-1; i >= 0; --i) {
            answer[index - i] = Integer.valueOf(number.charAt(i) - '0');
        }
        return answer;
        
    }
}