import java.math.*;
class shape{
        public void area(int x)
        {
          System.out.println("area of cicle is :"+(3.14*(float)x));
        }
        public void area(int a,int b)
        {
            System.out.println("area of rectangel is :"+(a*b));
        }
        public void area(int a,int b,int c)
        {    double s=(double)(a+b+c)/2;
            System.out.println("area of triangle  is :"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
        public void peri(int x)
        {
          System.out.println("perimeter of is : "+(int)(2*Math.PI*(x)));
        }
        public void peri(int a,int b)
        {
            System.out.println("perimeter of rectangle is : "+(a+b));
        }
        public void peri(int a,int b,int c)
        {
            System.out.println("perimeter of triangle is : "+(a+b+c));
        }
}
class circle extends shape
{
     circle(int x)
     {
        super.area(x);
        super.peri(x);
     }
}
class Rectangle extends shape{
    Rectangle(int a,int b)
    {
      super.area(a,b);
      super.peri(a,b);
    }
}
class Triangle extends shape{
     Triangle(int a,int b, int c)
     {
        area(a,b,c);
        peri(a,b,c);
     }
}

public class geometric_shape {
    public static void main(String[] args) {
        System.out.println(" hi geometry");
      new Rectangle(12,34);
       new Triangle(3, 4, 5); 
   new circle(7);

    }
}
