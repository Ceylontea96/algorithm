long* solution(long x, int n, int* returnSize) {
    if (n <= 0) {
        *returnSize = 0;
        return NULL;
    }

    long* answer = (long*)malloc(sizeof(long) * n);
    if (answer == NULL) {
        printf("Memory allocation failed.\n");
        *returnSize = 0;
        return NULL;
    }

    for (int i = 0; i < n; ++i) {
        answer[i] = x + x * i;
    }

    *returnSize = n;
    return answer;
}