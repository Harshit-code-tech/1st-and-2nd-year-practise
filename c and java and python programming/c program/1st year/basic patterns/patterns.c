#include <stdio.h>
#define c 5
int main()
{
    // square pattern

    int size = c;
    printf("Square pattern\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // hollow square
    printf("hollow square\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size; j++)
        {

            if (i == 0 || i == size - 1)
            {
                printf("*");
            }
            else
            {

                if (j == 0 || j == size - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // right triangle
    printf("right triangle\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 1; j < size - i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k <= i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // right triangle numbers
    printf("right triangle numbers\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 1; j < size - i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k <= i; k++)
        {
            printf("%d", (k + 1));
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // right down triangle
    printf("right down triangle\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int j = size; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // left side triangle
    printf("left side triangle\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // left number triangle
    printf("left number triangle\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j <= i; j++)
        {
            printf("%d", (j + 1));
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // left down triangle
    printf("left down triangle\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // left hollow triangle
    printf("left hollow triangle\n");
    for (int i = 1; i <= size; i++)
    {
        for (int j = 0; j < i; j++)
        {

            if (i != size)
            {

                if (j == 0 || j == i - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }

            else
            {
                printf("*");
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // pyramid
    printf("pyramid\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    // number increment in row pyramid
    printf("number increment in row pyramid\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++)
        {
            printf("%d", k + 1);
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // number increment in column
    printf("number increment in column\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++)
        {
            printf("%d", i + 1);
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // hollow pyramid
    printf("hollow pyramid\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++)
        {
            if (k == 0 || k == 2 * i || i == size - 1)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // hollow number pyramind
    printf("hollow number pyramid\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < size - i - 1; j++)
        {
            printf(" ");
        }

        int num = 1;
        for (int k = 0; k < 2 * i + 1; k++)
        {
            if (i == 0 || i == size - 1)
            {
                printf("%d", num++);
            }
            else
            {
                if (k == 0 || k == 2 * i)
                {
                    printf("%d", num++);
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // downside pyramid
    printf("downside pyramid\n");
    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * (size - i) - 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // down row numbers increment pyramid
    printf("down row numbers increment pyramid\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * (size - i) - 1; k++)
        {
            printf("%d", k + 1);
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // number increment downside column wise
    printf("number increment downside column wise\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < 2 * (size - i) - 1; k++)
        {
            printf("%d", i + 1);
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // hollow downside pyramid
    printf("hollow downside pyramid\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        int num = 1;
        for (int k = 0; k < 2 * (size - i) - 1; k++)
        {

            if (i == 0 || i == size - 1)
            {
                printf("%d", num++);
            }
            else
            {
                if (k == 0 || k == 2 * (size - i - 1))
                {
                    printf("%d", num++);
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // mix of both pyramid
    printf("mix pyramid\n");

    for (int i = 0; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = 0; k < (size - i) * 2 - 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 2; i <= size; i++)
    {

        for (int j = size; j > i; j--)
        {
            printf(" ");
        }

        for (int k = 0; k < i * 2 - 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // diamond
    printf("diamond\n");
    for (int i = 1; i <= size; i++)
    {

        for (int j = size; j > i; j--)
        {
            printf(" ");
        }

        for (int k = 0; k < i * 2 - 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 1; i <= size - 1; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = (size - i) * 2 - 1; k > 0; k--)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // number diamond
    printf("number diamond\n");

    int num = 1;

    for (int i = 1; i <= size; i++)
    {

        for (int j = size; j > i; j--)
        {
            printf(" ");
        }

        for (int k = 0; k < i * 2 - 1; k++)
        {
            printf("%d", num++);
        }

        num = 1;
        printf("\n");
    }

    for (int i = 1; i <= size - 1; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = (size - i) * 2 - 1; k > 0; k--)
        {
            printf("%d", num++);
        }

        num = 1;
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // hollow diamond/ barfi
    printf("hollow diamond/ barfi\n");
    for (int i = 1; i <= size; i++)
    {

        for (int j = size; j > i; j--)
        {
            printf(" ");
        }

        for (int k = 0; k < i * 2 - 1; k++)
        {
            if (k == 0 || k == 2 * i - 2)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }

    for (int i = 1; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = (size - i) * 2 - 1; k >= 1; k--)
        {
            if (k == 1 || k == (size - i) * 2 - 1)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");
    // hollow number diamond/barfi
    printf("hollow number diamond/ barfi\n");

    for (int i = 1; i <= size; i++)
    {

        for (int j = size; j > i; j--)
        {
            printf(" ");
        }

        for (int k = 0; k < i * 2 - 1; k++)
        {
            if (k == 0 || k == 2 * i - 2)
            {
                printf("%d", num++);
            }
            else
            {
                printf(" ");
            }
        }

        num = 1;
        printf("\n");
    }

    for (int i = 1; i < size; i++)
    {

        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        for (int k = (size - i) * 2 - 1; k >= 1; k--)
        {
            if (k == 1 || k == (size - i) * 2 - 1)
            {
                printf("%d", num++);
            }
            else
            {
                printf(" ");
            }
        }

        num = 1;
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // right pascal triangle
    printf("right pascal triangle\n");

    for (int i = 1; i <= size; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 1; i <= size - 1; i++)
    {
        for (int j = 0; j < size - i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    // left pascal triangle
    printf("left pascal triangle\n");

    for (int i = 1; i <= size; i++)
    {
        for (int j = 0; j < size - i; j++)
        {
            printf(" ");
        }
        for (int k = 0; k < i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (int i = 1; i <= size - 1; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }
        for (int k = 0; k < size - i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    printf("\n");

    return 0;
}
