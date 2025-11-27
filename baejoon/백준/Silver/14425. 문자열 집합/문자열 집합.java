import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] fibo; //값을 저장하는 배열

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }
        int cnt = 0;
        for (String key : map2.keySet()) {
            if (map1.containsKey(key)){
                cnt += map2.get(key);
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int[] arr) {

    }
}

