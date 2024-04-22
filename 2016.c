#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int a, int b) {
    char* day_select[7] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    int day[12] = {31,29,31,30,31,30,31,31,30,31,30,31};
    int count_day=0;
    for(int i=0;i<a-1;i++){
        count_day +=day[i];
    }
    count_day+=b;
    char* answer = (char*)malloc(3);
    answer = day_select[count_day%7];
    return answer;
}