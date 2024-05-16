#include <stdio.h>

int main() {
    int i;

    printf("Enter the number: \n");
    scanf("%d", &i);

    (i % 10 == 7 || i % 7 == 0)?printf("Buzz number"):printf("Not");
    
    return 0;
}
