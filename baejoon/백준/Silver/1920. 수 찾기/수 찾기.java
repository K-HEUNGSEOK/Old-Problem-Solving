import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
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

        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; i++){
            if (binarySearch(a, b[i])) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        while (end >= start){
            int mid = (start + end) /2 ;
            if(a[mid] == target) return true;
            else if(a[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
