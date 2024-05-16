#include<stdio.h>
#include<math.h>

int main()
{
    float pv, r, fv;
    int n;

    printf("Enter Present Value (PV), Rate of Interest (R) and Time Period (N): ");
    scanf("%f%f%d", &pv,&r,&n);
    fv = pv*pow(1 + r, n);
    printf("Future Value (FV) = %.2f", fv);
    return 0;
}
