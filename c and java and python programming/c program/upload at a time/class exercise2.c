#include <stdio.h>

int main() {
    int present, total;
    printf("Enter total number of students: ");
    scanf("%d", &total);
    printf("Enter number of students present: ");
    scanf("%d", &present);
    float percentage = (total - present) * 100.0 / total;
    printf("\nTotal number of students absent: %d\n", total - present);
    printf("Percentage of students absent: %.2f%%\n", percentage);
    float free_time = percentage >= 80 ? 60 :
                      percentage >= 60 ? present * 0.25 :
                      percentage >= 10 ? 50 - (60 - percentage) :
                      -1;
    if (free_time == -1) {
        printf("Invalid input.\n");
    } else {
        printf("Free time: %.3f minutes\n", free_time);
    }
    return 0;
}
