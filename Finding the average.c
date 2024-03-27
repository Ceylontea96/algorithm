#include <stdio.h>

double solution(int arr[], int arrSize) {
    double answer = 0;
    for (int i = 0; i < arrSize; ++i) {
        answer += arr[i];
    }
    answer /= arrSize;
    return answer;
}

int main() {
    // 테스트를 위한 배열 정의
    int arr[] = {1, 2, 3, 4, 5};
    int arrSize = sizeof(arr) / sizeof(arr[0]);
    double result = solution(arr, arrSize);
    printf("%lf\n", result); // 결과 출력
    return 0;
}