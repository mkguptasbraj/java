import java.util.Scanner;

public class questionno4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character ");
        char c = scanner.next().charAt(0);
        boolean isvowel = false;
        switch (c){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'I':
            case'O':
            case'U':
            case'E':isvowel=true;
        }
           if(isvowel){
               System.out.println(c+" is vowel");
           }else{
               System.out.println(c+" is not vowel");
           }
        }

}
