#include <stdio.h>

int collatz(long n, int cnt) {
    if (n == 1) {
        return cnt;
    }

    if (n % 2 == 0) {
        n /= 2;
    } else {
        n = n * 3 + 1;
    }

    if (cnt == 500 && n != 1) {
        return -1;
    }

    return collatz(n, cnt + 1);
}

int solution(int num) {
    return collatz(num, 0);
}

int main() {
    // 테스트를 위한 num 값 정의
    int num = 6;
    int result = solution(num);
    printf("%d\n", result); // 결과 출력
    return 0;
}