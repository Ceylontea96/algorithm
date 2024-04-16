#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len) {
    int* answer = (int*)malloc(sizeof(int)*numbers_len);
    int idx = numbers_len;

    int stack[1000001];
    int top = -1;

    for(int i=numbers_len-1;i>=0;i--)
    {
        int temp = numbers[i];

        while(top>-1)
        {
            if(temp < stack[top]) break;
            top--;
        }


        answer[--idx] = top<0 ? -1 : stack[top];
        stack[++top] = temp;
    }


    return answer;
}