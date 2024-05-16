#include <stdio.h>
#include <string.h>

// Define the structure
struct info {
    int roll_no;
    char name[50];
    float CGPA;
};

// Function to print the values of the structure members
int printInfo(struct info *ptr) {
    printf("%-10d%-20s%-10.2f\n", ptr->roll_no, ptr->name, ptr->CGPA);
}

int main() {
    int num_students;
    printf("Enter the number of students: ");
    scanf("%d", &num_students);

    // Declare an array of structures with size based on user input
    struct info students[num_students];

    // Loop to take user input for each student
    for (int i = 0; i < num_students; i++) {
        printf("\nStudent %d:\n", i + 1);

        // Take user input for roll_no
        printf("Enter Roll No: ");
        scanf("%d", &students[i].roll_no);

        // Take user input for name
        printf("Enter Name: ");
        scanf("%s", students[i].name);

        // Take user input for CGPA
        printf("Enter CGPA: ");
        scanf("%f", &students[i].CGPA);
    }

    // Print table header
    printf("\n%-10s%-20s%-10s\n", "Roll No", "Name", "CGPA");
    printf("---------------------------------------------\n");

    // Loop to print the values of each student
    for (int i = 0; i < num_students; i++) {
        printInfo(&students[i]);  // Pass the address of each student to the function
    }

    return 0;
}
