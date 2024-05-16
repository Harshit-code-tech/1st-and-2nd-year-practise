    #include <stdio.h>

    int main() {
        int a = 5, b=0;
        
        printf("%d,%d\n",a,b);
        b = a++;
        printf("%d,%d\n",a,b);
        b = ++a; 
        printf("%d,%d\n",a,b);
        b = a--;
        printf("%d,%d\n",a,b);
        b = --a;
        printf("%d,%d\n",a,b);
        return 0;
    }
