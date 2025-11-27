import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String commond = br.readLine();
        StringTokenizer st = new StringTokenizer(commond);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            String str = br.readLine();
            String[] split = str.split(" ");
            map.put(split[0], split[1]);
        }

        for(int i = 0 ; i < m ; i ++){
            String str = br.readLine();
            if (map.containsKey(str)){
                sb.append(map.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
}

