import java.util.*;
public class Occurence
{  static boolean present(char str[],char ch)
    {      boolean flag=false;
        for(int i=0;i<str.length;i++)
        {
          if(ch==str[i])
          {
            flag=true;
            break;
          }
        }
        return flag;
    }
    public static void main(String[] args) {
        char []a=new char[100];
        int b[]=new int[100];
        int k=-1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string : ");
       String s1=sc.nextLine(); 
   char[]str=s1.toCharArray();
      
       for(int i=0;i<str.length;i++)
       {
        if(str[i]==' ')
        {
            continue;
        }
        if(!present(a,str[i]))
        {
       
            k++;
            a[k]=str[i];
            b[k]+=1;
        }
        else
        {
          for(int j=0;j<=k;j++)
          {
            if(a[j]==str[i])
            {
                b[j]+=1;
            }
          }
        }
       
       }

  System.out.println( " \n");
       for(int i=0;i<=k;i++)
       {
  System.out.println(" "+a[i]+" "+b[i]);
       }
    }
}