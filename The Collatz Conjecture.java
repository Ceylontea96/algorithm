class Solution {
    public int solution(int num) {
        return collatz(num, 0);
    }
    
    public static int collatz(long n, int cnt) {
        if(n == 1) {
            return cnt;
        }
            
        if(n % 2 == 0)  n /= 2;    
        else            n = n * 3 + 1;

        if(cnt == 500 && n != 1) 
            return -1;
        
        return collatz(n, cnt+1);
    }
}