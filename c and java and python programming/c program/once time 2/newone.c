#include <stdio.h>
int main() {
    int present, total;
    printf("Enter total number of students: ");
    scanf("%d", &total);
    printf("Enter number of students present: ");
    scanf("%d", &present);
    
    float percentage = 100.0 * (total - present) / total;
    printf("\nTotal number of students absent: %d\nPercentage of students absent: %.2f%%\n", total - present, percentage);
    
    int absent_category;
    switch ((int) percentage / 10) {
        case 0:
        case 1:
        case 2:
            absent_category = 1;
            break;
        case 3:
            absent_category = 2;
            break;
        case 4:
            absent_category = 3;
            break;
        case 5:
            absent_category = 4;
            break;
        case 6:
            absent_category = 5;
            break;
        case 7:
            absent_category = 6;
            break;
        case 8:
            absent_category = 7;
            break;
        case 9:
        case 10:
            absent_category = 8;
            break;
        default:
            absent_category = -1;
            break;
    }
    
    float free_time;
    switch (absent_category) {
        case 1:
            free_time = 0;
            break;
        case 2:
            free_time = 50 - (percentage - 30);
            break;
        case 3:
            free_time = 50;
            break;
        case 4:
            free_time = 60 - (percentage - 50);
            break;
        case 5:
            free_time = present * 0.25;
            break;
        case 6:
            free_time = 45 + ((percentage - 70) / 2);
            break;
        case 7:
            free_time = 60;
            break;
        case 8:
            free_time = 60;
            break;
        default:
            free_time = -1;
            break;
    }
    
    if (free_time == -1) {
        printf("Invalid input.\n");
    } else {
        printf("Free time: %.2f minutes\n", free_time);
    }
    
    return 0;
}
