//c program to print details of the student who score highest mark in between 10 number of students(use structure to store information)
#include<stdio.h>

struct student {
   
    char name[50];
    int marks;
};

int main() {
    struct student s[10]; 
    int n, i, max;
    
    printf("Enter the number of students (max 10): ");
    scanf("%d", &n);
    
    printf("Enter the  number, name, and marks of the students:\n");
    for (i = 0; i < n; i++) {
        printf("Student %d:\n", i+1);
        
        printf("Name: ");
        scanf("%s", s[i].name);
        printf("Marks: ");
        scanf("%d", &s[i].marks);
    }
    
    max = 0; 
        for (i = 1; i < n; i++) {
        if (s[i].marks > s[max].marks) {
            max = i;
        }
    }
    
    printf("\nThe details of the student who scored the highest marks:\n");
   
    printf("Name: %s\n", s[max].name);
    printf("Marks: %d\n", s[max].marks);
    
    return 0;
}
