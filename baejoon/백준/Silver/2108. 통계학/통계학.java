import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int [] arr = new int[n];
        List<Integer> mode = new ArrayList<>();
        int sum = 0 ;
        for(int i = 0 ; i < n ; i ++){
            int num = sc.nextInt();
            sum += num;
            arr[i] = num;
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int max_count = 0;
        for (Integer key : map.keySet()) {
          int preq = map.get(key);
          if (preq > max_count){
              max_count = preq;
              mode.clear();
              mode.add(key);
          }else if(preq == max_count){
              mode.add(key);
          }
        }
        mode.sort(Integer::compareTo);
        int ans = 0;
        if (mode.size() == 1){
            ans = mode.get(0);
        }else{
            ans = mode.get(1);
        }


        Arrays.sort(arr);
        double avg = Math.round((double)sum / n);
        System.out.println((int)avg); // 평균
        System.out.println(arr[n/2]); // 중앙값
        System.out.println(ans); // 최빈값
        System.out.println(map.lastKey() - map.firstKey()); //범위

    }
}

