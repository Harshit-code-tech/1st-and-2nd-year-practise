#include <stdio.h>
int main() {
    int present, absent, total;
    float percentage, free_time;
    printf("Enter total number of students: ");
    scanf("%d", &total);
    printf("Enter number of students present: ");
    scanf("%d", &present);
    absent = total - present;
    percentage = (float) absent / total * 100;
    printf("\nTotal number of students absent: %d\n", absent);
    printf("Percentage of students absent: %.2f%%\n", percentage);
    free_time = percentage >= 80 ? 60.0 :
                percentage >= 60 ? (present * 0.5) / 2 :
                percentage >= 10 ? 50.0 - ((60 - percentage) * 1.0) : -1.0;
    if (free_time == -1.0) {
        printf("Invalid input.\n");
    } else {
        printf("Free time: %.3f minutes\n", free_time);
    }
    return 0;
}