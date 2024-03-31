#include <stdio.h>

// 각 자릿수의 합을 계산하는 함수
int digitSum(int num) {
    int sum = 0;
    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

// 하샤드 수 여부를 판단하는 함수
int solution(int x) {
    int sum = digitSum(x); // 자릿수의 합 계산
    return x % sum == 0; // x가 sum으로 나누어 떨어지는지 여부 반환
}

int main() {
    printf("%d\n", solution(18)); // 18은 하샤드 수이므로 1 출력
    printf("%d\n", solution(19)); // 19는 하샤드 수가 아니므로 0 출력
    return 0;
}