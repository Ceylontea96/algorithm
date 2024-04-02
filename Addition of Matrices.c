#include <stdio.h>

void matrixSum(int arr1[][500], int arr2[][500], int row, int col, int result[][500]) {
    for (int i = 0; i < row; ++i) {
        for (int j = 0; j < col; ++j) {
            result[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
}

int main() {
    int arr1[500][500] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int arr2[500][500] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int row = 3;
    int col = 3;

    int result[500][500];

    matrixSum(arr1, arr2, row, col, result);

    return 0;
}
