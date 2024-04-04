#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char* solution(int* food, int food_len) {
    int count[10] = { 0 };
    int total_len = 0;

    // 각 음식의 개수를 반으로 나눔
    for (int i = 1; i < food_len; i++) {
        count[i] = food[i] / 2;
        total_len += count[i] * 2;
    }

    // 물 포함 총 길이
    total_len += 1;

    char* answer = (char*)malloc(sizeof(char) * (total_len + 1));
    int idx = 0;

    // 음식 배치
    for (int i = 1; i < food_len; i++) {
        for (int j = 0; j < count[i]; j++) {
            answer[idx++] = i + '0';
        }
    }

    // 물 배치
    answer[idx++] = '0';

    // 역순으로 음식 배치
    for (int i = food_len - 1; i >= 1; i--) {
        for (int j = 0; j < count[i]; j++) {
            answer[idx++] = i + '0';
        }
    }

    answer[total_len] = '\0';
    return answer;
}
