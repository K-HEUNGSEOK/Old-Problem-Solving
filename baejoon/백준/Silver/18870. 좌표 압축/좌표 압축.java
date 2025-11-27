import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] copy = Arrays.copyOf(arr,arr.length);

        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 0;
        for(int i = 0 ; i < n ; i ++){
            if (!map.containsKey(copy[i])){
                map.put(copy[i], idx);
                idx ++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i ++){
            int num = arr[i];
            if (map.containsKey(num)){
                sb.append(map.get(num) + " ");
            }
        }
        System.out.println(sb);
    }

}
