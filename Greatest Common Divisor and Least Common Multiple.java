class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = findGCD(n, m);
        answer[1] = findLCM(n, m);
        return answer;
    }
    
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}