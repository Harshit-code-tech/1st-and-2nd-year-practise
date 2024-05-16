
#include <stdio.h>

int main() {
    int prevReading, currReading;
    float ratePerUnit, unitsConsumed, billAmount;

    // Input previous reading, current reading, and rate per unit
    printf("Enter previous reading (in units): ");
    scanf("%d", &prevReading);
    printf("Enter current reading (in units): ");
    scanf("%d", &currReading);
    printf("Enter rate per unit (in rupees): ");
    scanf("%f", &ratePerUnit);

    // Calculate units consumed and bill amount
    unitsConsumed = currReading - prevReading;
    billAmount = unitsConsumed * ratePerUnit;

    // Display bill amount
    printf("Units consumed: %.2f\n", unitsConsumed);
    printf("Bill amount: Rs. %.2f\n", billAmount);

    return 0;
}
