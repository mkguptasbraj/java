
public class xyz {

    int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    int multply (int a,int b,int c){
        int d= a*b*c;
        return d;

    }
    int multiply(int a,int b){
        int c= a*b;
        return c;
    }
    int difference (int a, int b){
        int c= b-a;
        return c;
    }

    public static void main(String[] args) {
    
        xyz obj = new xyz();
        int x = obj.sum(222,333);
        System.out.println(x);
        System.out.println(obj.multply(2,3,4));
        System.out.println(obj.difference(77, 55));
        System.out.println(obj.multiply(2,22));
        System.out.println("the highest mark of "+Math.max(33,999));
    }
}