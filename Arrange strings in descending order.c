#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    return -(strcmp((char *)a, (char *) b));
};
char* solution(const char* s) {
    char* answer = (char*)malloc(100000);

    char temp[strlen(s)];
    strcpy(temp, s);
    qsort(temp, strlen(s), sizeof(char), compare);

    strcpy(answer, temp);

    return answer;
}