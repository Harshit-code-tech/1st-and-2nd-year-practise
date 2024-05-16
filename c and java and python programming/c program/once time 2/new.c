#include <stdio.h>
int main() {
    int present,total;
    printf("Enter total number of students: ");// Take input of total students in the class
    scanf("%d",&total);
    printf("Enter number of students present: "); // Take input of total students present in the class
    scanf("%d",&present);
    float percentage=(total-present)*100.0/total;// Calculate the percentage of absent students
    printf("\nTotal number of students absent: %d\nPercentage of students absent: %.2f%%\n",total-present,percentage); // Print the number and percentage of absent students
    float free_time=(percentage>=80)?60:(percentage>=60)?60-((80-percentage)*0.5):(percentage<=60 && percentage>=20)?percentage-20:0;// Calculate the free time based on the percentage of absent students
    printf(free_time==0?"No free time.\n":"Free time: %.2f minutes\n",free_time); // Print the free time if it's a valid value, else an error message if it's not a valid value
    return 0;
}
