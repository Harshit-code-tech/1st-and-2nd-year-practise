#include <stdio.h>

// Function to find the frequency of an element in an array
int Fr(int arr[], int size, int element) {
    int frequency = 0;  // Initialize frequency to 0

    // Iterate through the array and count occurrences of the element
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            frequency++;
        }
    }

    return frequency;
}

int main() {
    int size;  // Size of the array
    int element;  // Element to find frequency of
    
    printf("Enter the size of the array: ");
    scanf("%d", &size);  // Take input for array size

    int arr[size];  // Declare an array of given size

    printf("Enter the elements of the array:\n");
    for (int i = 0; i < size; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);  // Take input for array elements
    }

    printf("Enter the element to find its frequency: ");
    scanf("%d", &element);  // Take input for element to find frequency

    // Call the Fr() function to get the frequency of the element
    int frequency = Fr(arr, size, element);

    printf("Frequency of %d in the array is: %d\n", element, frequency);
    // find the sum of all element which contain 3 using 1-d array
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    printf("Sum of all elements which contain 3 is: %d\n", sum);

    printf("\n\n");
    


    return 0;
}
