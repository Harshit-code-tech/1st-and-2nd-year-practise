//C program to swap 2 numbers using pass by value and pass by address using function
#include<stdio.h>
void swap(int *x,int *y)
{
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
    }
    int main()
    {
        int x,y;
        printf("Enter the value of x and y: ");
        scanf("%d%d",&x,&y);

        printf("Before swapping x=%d y=%d\n",x,y);
        swap(&x,&y);
        printf("After swapping x=%d y=%d\n",x,y);
        return 0;
        }
