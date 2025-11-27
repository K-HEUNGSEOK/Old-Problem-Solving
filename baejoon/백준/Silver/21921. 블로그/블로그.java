import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int test = 0 ;
        for(int i = 0 ; i < k -1; i ++){
            sum += arr[i];
            test += arr[i];
        }
        int max = 0;
        int cnt = 0;
        for(int i = k-1; i < n ; i ++){
            sum +=arr[i];
            if (sum> max) {
                max = sum;
            }

            sum -= arr[(i+1) - k];
        }

        for(int i = k-1; i < n ; i ++){
            test +=arr[i];
            if (test == max) {
                cnt ++;
            }

            test -= arr[(i+1) - k];
        }
        if (max == 0){
            System.out.println("SAD");
        }else {
            System.out.println(max);
            System.out.println(cnt);
        }
    }
}
