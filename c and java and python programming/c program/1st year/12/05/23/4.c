#include <stdio.h>
#define MT 100

typedef struct
{
    char name[50];
    float price;
} Item;

float CE(Item items[], int numItems)
{
    float TE = 0.0;
    for (int i = 0; i < numItems; i++)
    {
        TE += items[i].price;
    }
    return TE;
}

int main()
{
    Item items[MT];
    int numItems;
    float expenses, PFE;

    printf("Enter the number of items: ");
    scanf("%d", &numItems);

    if (numItems <= 0 || numItems > MT)
    {
        printf("Invalid number of items. Exiting...\n");
        return 1;
    }

    for (int i = 0; i < numItems; i++)
    {
        printf("\nEnter details for item %d:\n", i + 1);

        printf("Item name: ");
        scanf("%s", items[i].name);

        printf("Price: ");
        scanf("%f", &items[i].price);
    }

    expenses = CE(items, numItems);
    PFE = expenses / 2.0;

    printf("\nTotal expenses: %.2f\n", expenses);
    printf("Expenses per friend: %.2f\n", PFE);

    return 0;
}
