class rectangle{

    int length;
    int width;

void insert( int l , int w){
    length = l ;
    width = w;

}
void CalculationArea(){
System.out.println(  length *  width);
}
void calculationperimeter(){
    System.out.println(length + width);
}
}




public class f {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        rectangle r3  = new rectangle();
        r1.insert(10, 11);
         r2.insert(12, 12);
         r3.insert(13, 13);
         r1.CalculationArea();
         r2.CalculationArea();
         r3.CalculationArea();
         r1.calculationperimeter();
         r2.calculationperimeter();
         r3.calculationperimeter();
}
    
}
