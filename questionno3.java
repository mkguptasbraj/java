import java.util.Scanner;

public class questionno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year whose check the leap year or not");
        int year = scanner.nextInt();

            if(year%4==0 &&(year%100!=0||year%400==0)){
                System.out.println("that year is leap year");
            }
            else{
                System.out.println("that year is non leap");
            }

    }
}
