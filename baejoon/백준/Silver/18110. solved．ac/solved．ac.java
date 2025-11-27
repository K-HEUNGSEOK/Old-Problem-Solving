import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0){
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int cut = (int)Math.round(n * 0.15);

        int total = 0;
        for(int i = cut ; i < n - cut; i ++){
            total += arr[i];
        }

        double average = (double) total / (n - cut * 2);
        System.out.println(Math.round(average));
    }
}
