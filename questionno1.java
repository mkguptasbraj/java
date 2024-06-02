import java.util.Scanner;

public class questionno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which check the even or odd");
        int a = scanner.nextInt();
        
        if(a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
