#include<stdio.h>

int main()
{
    //let's assume the maximum arr size as 100.
    int arr[100], odd_arr[100], even_arr[100], size, odd_count = 0, even_count = 0, i;

    //get array size from the user
    printf("Enter array size\n");
    scanf("%d",&size);

    //get array elements from the user
    printf("Enter array elements\n");
    for(i = 0; i < size; i++)
        scanf("%d",&arr[i]);

    /*check each element in the array
    if its odd, increment odd count and store in odd_arr
    else, increment even count and store in even_arr
    */

    for(i = 0; i < size; i++)
    {
        if(arr[i] % 2 == 1)
        {
            odd_arr[odd_count] = arr[i];
            odd_count++;
        }
        else
        {
            even_arr[even_count] = arr[i];
            even_count++;
        }
    }

    //calculate the sum of odd and even numbers
    int odd_sum = 0, even_sum = 0;
    for(i = 0; i < odd_count; i++)
        odd_sum += odd_arr[i];

    for(i = 0; i < even_count; i++)
        even_sum += even_arr[i];

    //print the result
    printf("Odd number count = %d, sum = %d\n", odd_count, odd_sum);
    printf("Even number count = %d, sum = %d\n", even_count, even_sum);
    
    return 0;
}
