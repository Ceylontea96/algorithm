#include <stdio.h>
#include <stdbool.h>

int solution(int* absolutes, int absolutes_len, bool* signs, int signs_len) {
    int answer = 0;
    
    for (int i = 0; i < absolutes_len; i++) {
        if (signs[i])   answer += absolutes[i];
        else            answer -= absolutes[i];
    }
    
    return answer;
}