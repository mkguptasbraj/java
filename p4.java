import java.util.Scanner;

public class p4 {
    public static Class<int[]> main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int i, j;
        int target = 9;

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++)
                if (arr[i] + arr[j] == target) {
                    return int []{i,j};
                    
                }
            

        }
    }
}
