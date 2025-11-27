import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));

    }
    static int solution(int n, int k, int[] arr){
        Arrays.sort(arr);
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();
        int ans = 0;

        while (rt >= lt){
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= k){
                ans = mid;
                lt = mid +1;
            }else {
                rt = mid -1;
            }
        }
        return ans;
    }

    private static long count(int[] arr, int mid) {
        long total = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > mid){
                total += arr[i] -mid;
            }
        }
        return total;
    }

}
