#include <stdio.h>

// Define the structure
struct pkt{
    char ch1;
    char ch2[2];
    char ch3;
};

int main()
{
    // Declare a variable of type struct pkt
    struct pkt my_packet;

    // Declare a variable to hold the input number
    int input_number;

    // Prompt the user to enter a number
    printf("Enter a number: ");

    // Read in the number from the user
    scanf("%d", &input_number);

    // Store the number in the packet
    my_packet.ch1 = (input_number & 0xFF);
    my_packet.ch2[0] = ((input_number >> 8) & 0xFF);
    my_packet.ch2[1] = ((input_number >> 16) & 0xFF);
    my_packet.ch3 = ((input_number >> 24) & 0xFF);

    // Print the content of each member of the structure
    printf("ch1 = %d\n", my_packet.ch1);
    printf("ch2[0] = %d\n", my_packet.ch2[0]);
    printf("ch2[1] = %d\n", my_packet.ch2[1]);
    printf("ch3 = %d\n", my_packet.ch3);

    // Aggregate the members to form the original number and print it
    int output_number = (my_packet.ch1) | (my_packet.ch2[0] << 8) | (my_packet.ch2[1] << 16) | (my_packet.ch3 << 24);
    printf("Output number: %d\n", output_number);

    return 0;
}
