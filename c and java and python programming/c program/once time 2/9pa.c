#include <stdio.h>
#include <string.h>

int main() {
    char password[100];     // password protected file hehe.
    printf("Enter your password: ");
    fgets(password, 100, stdin);
    password[strcspn(password, "\n")] = '\0';
    if (strcmp(password, "Let's see") != 0) {
        printf("\nWrong password. Exiting...\n");
        return 1;
    }
    printf("\nYou entered the correct password.\n");

    float br, dr, sr, ar, ir, rr;    // variables to store rate of items
    float bt = 0, dt = 0, st = 0, at = 0, it = 0, rt = 0;    // variables to store the amount of individual items
    float total = 0;                                        // variable to store the total amount
    int ba, dos, sa, al, id, ra;     // variables to store number of items bought
    char name[100];
    int i,cus;                        // variable to store number of customers.

    // get customer's data
    printf("\nEnter name of the customer: ");
    fgets(name, 100, stdin);
    name[strcspn(name, "\n")] = '\0';

    printf("\nEnter number of customers: ");
    if (scanf("%d", &cus) != 1 || cus < 1) {
        printf("Invalid number of customers. Exiting...\n");
        return 1;
    }

    printf("\nEnter the bill number: ");
    if (scanf("%d", &i) != 1 || i < 1) {
        printf("Invalid bill number. Exiting...\n");
        return 1;
    }

    // get input for item-bada
    printf("\nEnter number of BADA: ");
    if (scanf("%d", &ba) == 1 && ba > 0) {
        printf("Enter rate of one BADA: ");
        if (scanf("%f", &br) != 1 || br <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        bt = ba * br;
    }

    // get input for item-dosa
    printf("\nEnter number of DOSA: ");
    if (scanf("%d", &dos) == 1 && dos > 0) {
        printf("Enter rate of one DOSA: ");
        if (scanf("%f", &dr) != 1 || dr <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        dt = dos * dr;
    }

    // get input for item-samosa
    printf("\nEnter number of SAMOSA: ");
    if (scanf("%d", &sa) == 1 && sa > 0) 
	{
        printf("Enter rate of one SAMOSA: ");
        if (scanf("%f", &sr) != 1 || sr <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        st = sa * sr;
	}
	
	//this section accepts input for item-allu bada
	printf("\nEnter number of ALLUBADA: ");
	if (scanf("%d", &al) == 1 && al > 0)
	{
		printf("Enter rate of one ALLUBADA: ");
        if (scanf("%f", &ar) != 1 || ar <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        at = al * ar;
	}
	
	//this section accepts input for item-idli
	printf("\nEnter number of IDLI: ");
	if (scanf("%d", &id) == 1 && id > 0)
	{
		printf("Enter rate of one IDLI: ");
        if (scanf("%f", &ir) != 1 || ir <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        it = id * ir;
	}
	
	//this section accepts input for rasogulla
	printf("\nEnter number of RASOGULLA: ");
	if (scanf("%d", &ra) == 1 && ra > 0)
	{
		printf("Enter rate of one RASOGULLA: ");
        if (scanf("%f", &rr) != 1 || rr <= 0) {
            printf("Invalid rate. Exiting...\n");
            return 1;
        }
        rt = ra * rr;
	}
	
	//this section calculates the total amonunt
	
	total=bt+dt+st+at+it+rt;
	
	//This section prints the bill
	printf("\n ---------------------------------------------------");
	printf("\n\t\tWELCOME TO KIIT\n\t_____________________________\n");
	printf("\t\tBILL NUMBER:%d\n",i);
	printf("\t\tName : %s",name);
	printf("\n\t\tNUMBER OF CUSTOMER/S:%d\t",cus);
	printf("\n\t-----------------------------------");
	printf("\n\t|ITEM|\t\t|No.|\t|Amount|\n");
    printf("\n\t-----------------------------------");
	if(bt>0)					//avoids printing item not purchased
	printf("\n\t|BADA|\t\t|%d|\t|%.3f|\n",ba,bt);
	if(dt>0)
	printf("\n\t|DOSA|\t\t|%d|\t|%.3f|\n",dos,dt);
	if(st>0)
	printf("\n\t|SAMOSA|\t|%d|\t|%.3f|\n",sa,st);
	if(at>0)
	printf("\n\t|ALLU BADA|\t|%d|\t|%.3f|\n",al,at);
	if(it>0)
	printf("\n\t|IDLI|\t\t|%d|\t|%.3f|\n",id,it);
	if(rt>0)
	printf("\n\t|RASOGULLA|\t|%d|\t|%.3f|\n",ra,rt);
	printf("\n_________________________________\n");
	printf("\t\t    TOTAL = Rs.%.3f\n",total);
	printf("\n\tTHANK YOU VISIT AGAIN\n");

	return 0;
}