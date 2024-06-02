import java.util.*;
public class Peterson_number
{    static int  fact(int x)
    {
  if(x==0||x==1)
  return 1;
  else 
  return (x*fact(x-1));
    }
    static boolean isPeterson(int x)
    {    boolean flag=false;
        int i,k=x,r,s=0;
              while(k>0)
              {
                r=k%10;
                 s=s+fact(r);
                 k=k/10;
              }
              if(s==x)
              {
                flag=true;
              }
        return flag;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter an enteger number");
       int x=sc.nextInt();
        boolean result=isPeterson(x);
        if(result==true)
        System.out.println(x+"  is a peterson number");
        else 
        System.out.println(x+"  is not a  peterson number");
    }
}