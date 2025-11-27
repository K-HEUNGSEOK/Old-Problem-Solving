import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean[] arr = new boolean[end+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(end); i ++){
            if (arr[i]){
                for(int j = i * i; j <= end; j +=i){
                    arr[j] = false;
                }
            }
            }
        StringBuilder sb = new StringBuilder();
        for(int i = start ; i<=end; i ++){
            if (arr[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        }
    }
