import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");
        int k = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        int [] arr = new int [k];
        int max = 0 ;
        for(int i = 0 ; i < k ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]){
                max = arr[i];
            }
        }
        long ans = 0L;
        long left = 1;
        long right = max;

        while (right >= left){
            long mid = (left + right) / 2;
            long total = 0;
            for (int i : arr) {
                total += (i / mid);
            }

            if (total >= n){
                ans =  mid;
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        System.out.println(ans);
    }
}
