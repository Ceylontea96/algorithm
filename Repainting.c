#include <stdio.h>
#include <stdlib.h>

int compare(const void* a, const void* b) {
    return *(int*)a - *(int*)b;
}

int solution(int n, int m, int* section, int section_len) {
    int answer = 0;
    int start = 0;
    
    qsort(section, section_len, sizeof(int), compare);
    
    while (start < section_len) {
        int end = start;
        while (end < section_len && section[end] - section[start] + 1 <= m) {
            end++;
        }
        start = end;
        answer++;
    }
    
    return answer;
}