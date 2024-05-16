#include<stdio.h>
#include<math.h>

int main()
{
    int num, temp, r = 0, s = 0, i;
    float cube;
    for(i = 1; i <= 500; i++)
    {
        num = i;
        temp = i;
        while(num != 0)
        {
            r = num % 10;
            cube = pow(r, 3);
            s = s + cube;
            num = num / 10;
        }
        if(s == temp)
        {
            printf("%d\n",temp);
        }
        r = 0;
        s = 0;
        cube = 0;
    }
    return 0;
}
