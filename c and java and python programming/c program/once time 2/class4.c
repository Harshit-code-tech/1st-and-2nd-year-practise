


#include <stdio.h>

int main() {
   int arr[100], n, i;

   //taking input for the size of the array
   printf("Enter number of elements: ");
   scanf("%d", &n);

   //taking input for the array elements
   printf("Enter the array elements: ");
   for(i=0; i<n; i++){
      scanf("%d", &arr[i]);
   }

   //printing the array elements in reverse order
   printf("\nThe array elements in reverse order are: ");
   for(i=n-1; i>=0; i--){
      printf("%d ", arr[i]);
   }

   return 0;
}

