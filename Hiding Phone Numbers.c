#include <stdio.h>
#include <string.h>

char* solution(char* phone_number) {
    int length = strlen(phone_number);
    // 전화번호의 뒷 4자리를 제외한 나머지 숫자를 '*'로 가림
    for (int i = 0; i < length - 4; ++i) {
        phone_number[i] = '*';
    }
    return phone_number;
}