#include <stdio.h>

struct st
{
    int rollNo;
    char name[50];
    char gender;
    float marks;
} st;

int main()
{

    printf("Enter Roll No: ");
    scanf("%d", &st.rollNo);

    printf("\nEnter Name: ");
    scanf("%s", st.name);

    printf("\nEnter Gender (M/F): ");
    scanf(" %c", &st.gender);

    printf("\nEnter Marks: ");
    scanf("%f", &st.marks);

    printf("\nStudent Information:\n");
    printf("Roll No: %d\nName: %s\nGender: %c\nMarks: %.2f\n", st.rollNo,st.name,st.gender,st.marks);
    return 0;
}
