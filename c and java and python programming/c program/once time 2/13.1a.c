#include <stdio.h>

int main() {
   int days, months, remaining_days;
   
   printf("Enter the number of days: ");
   scanf("%d", &days);
   
   months = days / 28;    // Assuming 1 month = 30 days
   remaining_days = days % 28;
   
   printf("%d days = %d months and %d days\n", days, months, remaining_days);
   
   return 0;
}
