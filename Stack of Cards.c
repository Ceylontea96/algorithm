#include <stdio.h>
#include <stdbool.h>
#include <string.h>

char* solution(char** cards1, int cards1_len, char** cards2, int cards2_len, char** goal, int goal_len) {
    int idx1 = 0, idx2 = 0, idx_goal = 0;

    while (idx_goal < goal_len) {
        if (idx1 < cards1_len && strcmp(cards1[idx1], goal[idx_goal]) == 0) {
            idx1++;
        } else if (idx2 < cards2_len && strcmp(cards2[idx2], goal[idx_goal]) == 0) {
            idx2++;
        } else {
            return "No";
        }
        idx_goal++;
    }

    return "Yes";
}