#include<stdio.h>
int main(int argc, char const *argv[])
{
    int number , index =0;
    printf("Enter the number");
    scanf("%d" , & number);
    do
    {
        printf("%d\n" , index+1 );
        index=index+1;
    } while (index<number);
    



    return 0;
}
