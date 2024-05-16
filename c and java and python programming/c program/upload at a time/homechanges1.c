#include <stdio.h>
int main() {
    int present, total;
    printf("Enter total number of students: ");
    if (scanf("%d", &total) != 1 || total <= 0) { // Check if input is valid
        printf("Invalid input.\n");
        return 0;
    }
    printf("Enter number of students present: ");
    if (scanf("%d", &present) != 1 || present < 0 || present > total) { // Check if input is valid
        printf("Invalid input.\n");
        return 0;
    }
    float percentage = (total - present) * 100.0 / total;
    printf("\nTotal number of students absent: %d\nPercentage of students absent: %.2f%%\n", total - present, percentage);
    float free_time = (percentage >= 80) ? 60 : (percentage >= 60) ? 60 - ((80 - percentage) * 0.5) : (percentage >= 20) ? percentage - 20 : 0;
    printf(free_time == 0 ? "No free time.\n" : "Free time: %.2f minutes.\n", free_time);
    return 0;
}
