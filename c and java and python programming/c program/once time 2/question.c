#include <stdio.h>
//range is 27 for now

int main() {
    int m;
    printf("Enter the number of rows: ");
    scanf("%d", &m);

    // Print upper part of the pattern
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= i; j++) {
            if (m - j + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - j + 1);
        }
        for (int j = i + 1; j <= m; j++) {
            if (m - i + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - i + 1);
        }
        for (int j = m - 1; j >= i; j--) {
            if (m - i + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - i + 1);
        }
        for (int j = i - 1; j >= 1; j--) {
            if (m - j + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - j + 1);
        }
        printf("\n");
    }

    // Print lower part of the pattern
    for (int i = m - 1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (m - j + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - j + 1);
        }
        for (int j = i + 1; j <= m; j++) {
            if (m - i + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - i + 1);
        }
        for (int j = m - 1; j >= i; j--) {
            if (m - i + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - i + 1);
        }
        for (int j = i - 1; j >= 1; j--) {
            if (m - j + 1 < 10) {
                printf(" ");
            }
            printf("%d", m - j + 1);
        }
        printf("\n");
    }

    // 1st one
   


    return 0;
}
