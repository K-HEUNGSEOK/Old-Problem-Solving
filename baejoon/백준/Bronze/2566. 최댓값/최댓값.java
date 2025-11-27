import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr, n);
    }
    static void solution(int[][] arr, int n){
        int max = 0;
        int idxI = 0;
        int idxJ = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    idxI = i;
                    idxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println( (idxI+1) + " " + (idxJ+1) );
    }
}