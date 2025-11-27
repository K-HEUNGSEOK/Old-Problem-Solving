import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[100][100];
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i =0 ; i < n ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            x[i] = a;
            y[i] = b;
        }
        for(int c = 0 ; c < n ; c ++){
            for(int i = x[c]; i < x[c] + 10; i ++){
                for(int j = y[c]; j < y[c] + 10 ; j ++){
                    arr[i][j] = 1;
                }
            }
        }
        int total = 0;
        for(int i = 0 ; i < 100; i ++){
            for(int j = 0 ; j < 100; j ++){
                if (arr[i][j] == 1){
                    total ++;
                }
            }
        }
        System.out.println(total);
     }

    private static int gcd(int a, int b) {
    return -1;
    }
}
