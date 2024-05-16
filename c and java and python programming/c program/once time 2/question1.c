#include <stdio.h>

int main() {
    int m;
    printf("Enter the number of rows: ");
    scanf("%d", &m);

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= m; j++) {
            int x = m - abs(m - j) - abs(m - i) + 1;
            printf("%2d", x);
        }
        for (int j = m - 1; j >= 1; j--) {
            int x = m - abs(m - j) - abs(m - i) + 1;
            printf("%2d", x);
        }
        printf("\n");
    }

    for (int i = m - 1; i >= 1; i--) {
        for (int j = 1; j <= m; j++) {
            int x = m - abs(m - j) - abs(m - i) + 1;
            printf("%2d", x);
        }
        for (int j = m - 1; j >= 1; j--) {
            int x = m - abs(m - j) - abs(m - i) + 1;
            printf("%2d", x);
        }
        printf("\n");
    }

    return 0;
}
