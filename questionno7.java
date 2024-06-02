import java.sql.SQLOutput;
import java.util.Scanner;

public class questionno7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number");
        double number = sc.nextDouble();
        double sum = 0;
        for(int i = 0;i<=number;i++){
            sum = sum +number;
        }
        System.out.println("the sum of the number is:"+sum);
    }
}
