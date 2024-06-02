class mymatrix{
  int a[][];
mymatrix()
{ a=new int[3][3];
 for(int i=0;i<3;i++)
 {
    for(int j=0;j<3;j++)
    {
        a[i][j]=i+(j);
    }
 }
}
public void find_max()
{
    int max=a[0][0];
    int row_index=0,col_index=0;
    for(int i=0;i<3;i++)
 {
    for(int j=0;j<3;j++)
    {
        if(max<a[i][j])
        {
            max=a[i][j];
            row_index=i;
            col_index=j;
        }
    }
 }
 System.out.println("max element is : "+max+" row : "+(row_index+1)+" col index : "+(col_index+1));
}
}
public class Matrix {
public static void main(String[] args) {
   
    mymatrix m1=new mymatrix();
    m1.find_max();
    
}
    
}
