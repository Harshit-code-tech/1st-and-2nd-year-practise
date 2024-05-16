#include <stdio.h>


struct TEMP {
    double value;
    char scale;
}T1, T2;


double F2C(double F) {
    return (F - 32) * 5 / 9;
}

double C2F(double C) {
    return C * 9 / 5 + 32;
}

int main() {
   
  

    printf("Enter TEMP 1 value: ");
    scanf("%lf", &T1.value);
    printf("Enter TEMP 1 scale (F or C): ");
    scanf(" %c", &T1.scale);

    if (T1.scale == 'F'|'f') {
        T2.value = F2C(T1.value);
        T2.scale = 'C';
    } else {
        T2.value = C2F(T1.value);
        T2.scale = 'F';
    }

    printf("%.2f %c = %.2f %c\n", T1.value, T1.scale, T2.value, T2.scale);

  
    printf("Enter TEMP 2 value: ");
    scanf("%lf", &T2.value);
    printf("Enter TEMP 2 scale (F or C): ");
    scanf(" %c", &T2.scale);

    if (T2.scale == 'F'|'f') {
        T1.value = F2C(T2.value);
        T1.scale = 'C';
    } else {
        T1.value = C2F(T2.value);
        T1.scale = 'F';
    }

    printf("%.2f %c = %.2f %c\n", T2.value, T2.scale, T1.value, T1.scale);

    return 0;
}
