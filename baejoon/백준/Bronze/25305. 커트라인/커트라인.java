import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] fibo; //값을 저장하는 배열

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n - k]);
    }

    static void dfs(int[] arr) {

    }
}

