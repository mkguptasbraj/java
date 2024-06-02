import java.util.*;
class operation 
{
    
    public int add(int x,int y)
    {
       return (x+y);
    }
    public int subtract(int x,int y)
    {
       return (x-y);
    }
    public int multiply(int x,int y)
    {
       return (x*y);
    }
    public int divide(int x,int y)
    {  if(y==0)
        {
            System.out.println("0 is not allowed in denominator");
            return 0;
        }
        else
        return(x/y);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operation op=new operation();
        while(true)
        {
         System.out.println("enter two enteger number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("1: to add");
        System.out.println("2: to subtract");
        System.out.println("3: to multiply");
        System.out.println("4: to divide");
        System.out.println("5: to treminate");
       
        System.out.println("enter your choice");
         int choice=sc.nextInt();
        switch (choice) {
            case 1:
                      System.out.println(op.add(x, y));
                break;
            case 2:
                 System.out.println(op.subtract(x, y));
                break;
            case 3:
                 System.out.println(op.multiply(x, y));
                break;  
            case 4:
                 System.out.println(op.divide(x, y));
            case 5:
                 return ;

         
            default:
            System.out.println("invalid choice input data again ");
                break;
        } 

    }
}
}
