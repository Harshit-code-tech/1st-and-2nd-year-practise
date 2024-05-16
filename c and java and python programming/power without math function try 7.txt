#include <stdio.h>
#include <math.h>

double power(double base, double exponent);
double power_recursive(double base, int exponent);
double relative_error(double x, double y);

int main() {
    double base, exponent, result, real_value, error;
    
    // Get input from user
    printf("Enter base: ");
    scanf("%lf", &base);

    printf("Enter exponent: ");
    scanf("%lf", &exponent);

    // Calculate result based on exponent value
    if (fabs(exponent) < 10.0) {
        result = power(base, exponent);
    } else {
        result = power_recursive(base, (int) exponent);
    }

    // Calculate real value using pow function
    real_value = pow(base, exponent);

    // Calculate relative error
    error = relative_error(real_value, result);

    // Print output with formatting
    printf("Result: %.6lf\nReal value: %.6lf\nRelative error: %.6lf%%\n", result, real_value, error * 100.0);

    return 0;
}

// Calculate power using Taylor series approximation
double power(double base, double exponent) {
    if (exponent == 0.0) { // Base case: any number to the power of 0 is 1
        return 1.0;
    }
    else if (exponent < 0.0) { // Recursive case: any number to a negative power is the reciprocal of the number to the positive power
        return 1.0 / power(base, -exponent);
    }
    else { // Recursive case: for small exponents, use Taylor series approximation
        double result = 1.0, term = 1.0, x = exponent * log(base);
        for (int i = 1; i <= 100; i++) {
            term *= x / i;
            result += term;
        }
        return result;
    }
}

// Recursive function to calculate power for large exponents
double power_recursive(double base, int exponent) {
    if (exponent == 0) { // Base case: any number to the power of 0 is 1
        return 1.0;
    }
    else if (exponent == 1) { // Base case: any number to the power of 1 is itself
        return base;
    }
    else if (exponent % 2 == 0) { // Recursive case: for even exponents, split exponent in half and recursively calculate power of each half
        double tmp = power_recursive(base, exponent / 2);
        return tmp * tmp;
    }
    else { // Recursive case: for odd exponents, split exponent into (exponent-1)/2 and exponent/2 and recursively calculate power of each half
        double tmp = power_recursive(base, (exponent - 1) / 2);
        return base * tmp * tmp;
    }
}

// Function to calculate relative error between two numbers
double relative_error(double x, double y) {
    return fabs((x - y) / x);
}
