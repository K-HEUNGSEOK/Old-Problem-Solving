import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
       int[][] arr = new int[15][15];

       for(int i = 0 ; i < 1; i ++){
           int cnt = 1;
          for(int j = 0; j < arr.length; j ++){
              arr[i][j] = cnt ++;
          }
       }


       for(int i = 0 ; i < c; i ++){
           int k = sc.nextInt();
           int n = sc.nextInt();
           fillarr(k, n, arr);
           System.out.println(arr[k][n-1]);
       }


    }

    private static void fillarr(int k, int n, int[][] arr) {
        for(int i = 1 ; i <=k; i ++){
            for(int j = 0 ; j < n; j ++){
                int sum = 0;
                    for (int z = 0; z <= j; z++){
                        sum += arr[i-1][z];
                    }

                arr[i][j] = sum;
            }
        }
    }

}
