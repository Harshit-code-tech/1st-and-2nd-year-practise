#include <stdio.h>

typedef union {
    unsigned int num;
    unsigned char bytes[4];
} EndianTest;

int main() {
    // Check endianness of host machine
    int isLittleEndian = 0;
    unsigned int num = 0x12345678;

    // Determine endianness of host machine
    if (*((unsigned char*)&num) == 0x78) {
        isLittleEndian = 1;
        printf("Host machine is Little Endian\n");
    } else {
        printf("Host machine is Big Endian\n");
    }

    // Enter a number
    printf("Enter a number: ");
    scanf("%u", &num);

    // Print byte content before conversion
    printf("Byte Content (in %s Endian):\n", isLittleEndian ? "Little" : "Big");
    for (int i = 0; i < 4; i++) {
        printf("Byte %d: 0x%02X\n", i+1, *((unsigned char*)&num + i));
    }

    // Convert endianness
    EndianTest et;
    et.num = num;
    EndianTest converted;
    converted.bytes[0] = et.bytes[3];
    converted.bytes[1] = et.bytes[2];
    converted.bytes[2] = et.bytes[1];
    converted.bytes[3] = et.bytes[0];
    num = converted.num;

    // Print byte content after conversion
    printf("Byte Content (in %s Endian) after conversion:\n", isLittleEndian ? "Big" : "Little");
    for (int i = 0; i < 4; i++) {
        printf("Byte %d: 0x%02X\n", i+1, *((unsigned char*)&num + i));
    }

    return 0;
}
