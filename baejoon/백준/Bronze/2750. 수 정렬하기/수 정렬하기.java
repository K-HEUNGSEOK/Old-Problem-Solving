import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        solution(arr,n);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void solution(int[]arr, int n ){
        for(int i = 0 ; i < n-1 ; i ++){
            for(int j = 0; j < n - 1 - i ; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
