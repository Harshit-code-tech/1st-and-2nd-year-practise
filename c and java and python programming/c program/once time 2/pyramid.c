#include <stdio.h>

int main() {
    int i, j, n;

    // print a pyramid
    printf("\t\t\t*\n\t\t       ***\n\t\t      *****\n\n\n");

    // print a square 
    for (i=1; i<=4; i++) {
        for (j=1; j<=4; j++) {
            printf("*\t");
        }
        printf("\n");
    }

    printf("\n");
    printf("\n");

    // print a pyramid
    printf("Enter a number of n: ");
    scanf("%d", &n);

    for (i=0; i<n; i++, puts("")) {
        printf("%*s%.*s", n-i, "", 1+2*i, "***************************");
    }
 printf("\n");
  printf("\n");
    

     int rows = 10;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j < i; j++) {
            printf("%d ", j);
        }
        for (int j = i - 1; j > 0; j--) {
            printf("%d ", j);
        }
        printf("\n");
 
   }
 printf("\n");
  printf("\n");
// print as 1 \n 22\n 333.... and so on 
    int a;
    printf("Enter the number of rows: ");
    scanf("%d", &a);
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", i);
        }
        printf("\n");
    }
 printf("\n");
  printf("\n");




    int b;
    printf("Enter the number of rows: ");
    scanf("%d", &b);
    for (int i = 1; i <= b; i++) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
 printf("\n");
  printf("\n");


    int n_, count = 1;
    printf("Enter the number of rows: ");
    scanf("%d", &n_);
    for (int i = 1; i <= n_; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", count);
            count++;
        }
        printf("\n");
    }

printf("\n");
printf("\n");
    int m;
    printf("Enter a number of n: ");
    scanf("%d", &m);

    for (int i = 0; i <m; i++) {
        for (int j = 0; j < m - i - 1; j++) {
            printf(" ");
        }
        for (int j = 0; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

    for (int i = 0; i <  m- 1; i++) {
        for (int j = 0; j <= i + 1; j++) {
            printf(" ");
        }
        for (int j = 0; j < m - i - 2; j++) {
            printf("* ");
        }
        printf("\n");
    }
printf("\n");
printf("\n");



    int c;
    printf("Enter the number of columns: ");
    scanf("%d", &c);
    for (int i = 1; i <= c; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d", j);
        }
        printf("\n");
    }
 printf("\n");

    printf("\n");
     // C program to print diamond shape * pattern and it's mirror
     


    int d, k;

    printf("Enter the value of d: ");
    scanf("%d", &d);

    for (i = 1; i <= d; i++) {
        for (j = 1; j <= d - i; j++) {
            printf(" ");
        }
        for (k = 1; k <= 2 * i - 1; k++) {
            printf("*");
        }
        printf("\n");
    }

    for (i = d - 1; i >= 1; i--) {
        for (j = 1; j <= d - i; j++) {
            printf(" ");
        }
        for (k = 1; k <= 2 * i - 1; k++) {
            printf("*");
        }
        printf("\n");
    }

  
return 0;
}
