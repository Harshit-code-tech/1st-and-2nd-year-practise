#include <stdio.h>
int main() {
    int present, total;
    printf("Enter total number of students: ");
    scanf("%d", &total);
    printf("Enter number of students present: ");
    scanf("%d", &present);
    float percentage = 100.0 * (total - present) / total; // Calculate the percentage of absent students
    printf("\nTotal number of students absent: %d\nPercentage of students absent: %.2f%%\n", total - present, percentage);  // Print the number and percentage of absent students
    float free_time = percentage >= 80 ? 60 :  // Calculate the free time based on the percentage of absent students
                      percentage >= 60 ? present / 4.0 :
                      percentage >= 10 ? 50 - (60 - percentage) : -1;
    printf(free_time == -1 ? "Invalid input.\n" : "Free time: %.2f minutes\n", free_time);  // Print the free time if it's a valid value, or an error message if it's not
    return 0;
}
