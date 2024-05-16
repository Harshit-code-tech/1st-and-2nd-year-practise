#include <stdio.h>

int main()
{
    int math, science;

    printf("Enter marks in Math: ");
    scanf("%d", &math);

    printf("Enter marks in Science: ");
    scanf("%d", &science);

    if (math >= 50 && science >= 50) {
        printf("You passed in both Math and Science, reward amount:$50\n");
        } else if (math >= 50 || science >= 50) {
        printf("You passed in only one subject, reward amount: $25\n");
    } else {
        printf("You failed in both subjects, reward amount: $0\n");
    }

    return 0;
}