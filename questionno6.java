import java.util.Scanner;

public class questionno6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        System.out.println("enter the power");
        int power = scan.nextInt();
        int intialnum = number;
        for(int i=1;i<power;i++){
            number = number*intialnum ;

        }
        System.out.println ( " the power "+power +" of number"+" :" + +number);
    }
}
