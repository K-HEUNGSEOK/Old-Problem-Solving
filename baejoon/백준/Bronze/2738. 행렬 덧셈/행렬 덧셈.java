import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[][] A = new int[l][r];
        int[][] B = new int[l][r];
        fillArray(A,l, r, sc);
        fillArray(B,l,r,sc);
        int[][] result = solution(A,B,l,r);
        for(int i = 0 ; i < l ; i ++){
            for(int j = 0 ; j < r; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void fillArray(int[][] arr, int l, int r, Scanner sc) {
        for(int i = 0; i < l; i ++){
            for(int j = 0; j < r; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static int[][] solution(int[][] a, int[][] b, int l, int r){
        int[][] totalArray = new int[l][r];

        for(int i = 0 ; i < l ; i++){
            for(int j = 0; j < r;  j ++){
                totalArray[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return totalArray;
    }
}
