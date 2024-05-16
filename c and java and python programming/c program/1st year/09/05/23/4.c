#include <stdio.h>

int asum(int a[], int n) {
    if (n == 0) {
        return 0;
    }
    return a[n-1] + asum(a, n-1);
}


int main() {
    int a[50], n, sum;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sum = asum(a, n);
    printf("The sum of the elements of the array is %d.\n", sum);
    return 0;
}

