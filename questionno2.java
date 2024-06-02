import java.util.Scanner;

public class questionno2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = Scan.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println("the table of " +number +"X" + i +"=" +(i*number));
        }


    }
}
