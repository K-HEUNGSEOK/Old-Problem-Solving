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
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, k));
    }

    static int solution(int []arr, int k) {
        int ans = 0, sum = 0, lt = 0;
        for(int rt = 0 ; rt < arr.length; rt ++){
            sum += arr[rt];
            if (sum == k){
                ans ++;
            }

            while (sum >= k){
                sum -= arr[lt ++];
                if (sum == k){
                    ans ++;
                }
            }
        }
        return ans;
    }
}