  
  
  
  #include <stdio.h>
int main()
{
    int marks;
    printf("Enter your marks\n");
    scanf("%d", &marks);
    if (marks < 0 || marks > 100)
    {
        printf(" wrong marks");
    }
    else if (marks < 60)
    {
        printf("you fail");
    }
    else if (marks >= 60 && marks < 70)
    {
        printf("your grade is D");
    }

    else if (marks >= 70 && marks < 80)
    {
        printf("your grade is C");
    }
    else if (marks >= 80 && marks < 90)
    {
        printf("your grade is B");
    }
    else
    {
        printf(" your grade is A");
    }

    return 0;
}