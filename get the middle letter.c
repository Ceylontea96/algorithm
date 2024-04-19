#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* s) {
    char* answer;
    int c = strlen(s);
    if(c % 2)
    {
        answer = (char*)malloc(2);
        answer[0] = s[c/2];
        answer[1] = '\0';
    }
    else
    {
        answer = (char*)malloc(3);
        answer[0] = s[c/2-1];
        answer[1] = s[c/2];
        answer[2] = '\0';
    }
    return answer;
}