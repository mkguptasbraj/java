#include<stdio.h>
void main(){
    int N;
    printf("Enter the year\n");
    scanf("%d",&N);

   if (N%4==0 && N%400==0 && N%100==0)
   {
    printf("leap year");
   }
   
   else
   {
    printf("leap  not year");
   }
   
}