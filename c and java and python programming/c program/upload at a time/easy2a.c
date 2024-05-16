#include<stdio.h>

int main() {
    int code, call; // variable to store customer code and number of calls
    float bill; // variable to store calculated bill

    printf("Enter customer code and number of calls made: \n");
    scanf("%d \t%d", &code, &call); // read customer code and number of calls

    bill = 250 + (call * 1.25); // calculate bill using the formula given in the problem statement
    // Rs. 250 is the fixed monthly charge and Rs. 1.25 is the charge per call made over and above 100 calls.

    printf("Customer code = %d\nBill = %.3fRs.", code,bill); // print the calculated bill with 3 decimal places

    return 0;
}
