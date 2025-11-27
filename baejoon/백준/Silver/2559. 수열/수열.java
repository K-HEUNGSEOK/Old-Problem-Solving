import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < k -1; i ++){
            sum +=arr[i];
        }
        int max = Integer.MIN_VALUE;

        for(int i = k -1; i < n ; i ++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            sum-=arr[(i + 1)-k];
        }
        System.out.println(max);
    }
}
