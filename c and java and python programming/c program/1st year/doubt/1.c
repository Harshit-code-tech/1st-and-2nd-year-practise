#include <stdio.h>

int swap(int *a, int *b) {
    int temp = *a;  // Store the value of a
    *a = *b;        // Assign the value of b to a
    *b = temp;      // Assign the stored value of a to b
}

int main() {
    int num1,num2 ;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    printf("Before swapping: num1 = %d, num2 = %d\n", num1, num2);

    // Call the swap function with pointers to num1 and num2
    swap(&num1, &num2);

    printf("After swapping: num1 = %d, num2 = %d\n", num1, num2);

    return 0;
}
