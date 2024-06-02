/*
income tax to be paid by an employee to goverment as per slabs mentioned below
Income slab      Tax
2.5- 5.0 L       5%
5.0L - 10.0L     20%
above 10L         30%
*/
#include <stdio.h>
int main()
{
    float tax = 0, income;
    printf("enter your income\n");
    scanf("%f", &income);
    if (income >= 250000 && income <= 500000)
    {
        tax = tax + 0.05 * (income - 250000);
    }
    if (income >= 500000 && income <= 1000000)
    {
        tax = tax + 0.20 * (income - 500000);
    }
    if (income >= 1000000)

    {
        tax = tax + 0.30 * (income - 1000000);
    }

    printf("your net incometax to  be paid by end of this month is %f \n", tax);

        return 0;
}