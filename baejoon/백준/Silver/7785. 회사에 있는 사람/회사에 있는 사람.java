import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] fibo; //값을 저장하는 배열

    public static void main(String[] args) throws IOException {
     
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            String str = br.readLine();
            String[] split = str.split(" ");
            int num = 0;
            if (split[1].equals("enter")){
                num = 1;
            }else {
                num = -1;
            }
            map.put(split[0], map.getOrDefault(split[0], 0) + num);
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) <= 0){
                list.add(key);
            }
        }

        for (String s : list) {
            map.remove(s);
        }
        String [] str = new String[map.size()];
        int idx = 0;
        for (String s : map.keySet()) {
            str[idx++] = s;
        }
        Arrays.sort(str,(a,b) -> b.compareTo(a));
        for (String s : str) {
            System.out.println(s);
        }
    }

//    static int solution(int n) {
//
//    }
}

