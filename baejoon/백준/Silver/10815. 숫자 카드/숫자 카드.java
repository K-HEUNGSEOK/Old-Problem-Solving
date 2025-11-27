import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] b = new int[m];
        for(int i = 0 ; i < m ; i ++){
            b[i] = sc.nextInt();
        }
        System.out.println(solution(a,b));

    }
    static String solution(int[] a, int [ ]b){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(a);
        for (int target : b) {
            if (binarySearch(target,a)){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }
        return sb.toString();
    }

    private static boolean binarySearch(int target, int[] a) {
        int lt = 0;
        int rt = a.length-1;
        while (rt >= lt){
            int mid = (lt + rt) / 2;
            if (a[mid] == target){
                return true;
            }

            if (a[mid] > target){
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }
        return false;
    }

}
